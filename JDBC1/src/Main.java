import DAO.*;
import db.DatabaseConnectionManager;
import models.Student;
import models.Subject;
import models.Teacher;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "admin"
        );

        SubjectDao subjectDao = new Subjectdaoimplementation();
        StudentDao studentDao = new StudentDaoImplementation();
        TeacherDao teacherDao = new TeacherDaoImplementation();
        TeacherService teacherService = new TeacherService(teacherDao, subjectDao);
        Subject math = subjectDao.create(new Subject("math"));
        System.out.println(math);
        Student student = studentDao.create(new Student("nata", "kvantaliani", 5));
        System.out.println(student);
        Teacher teacher = teacherDao.create(new Teacher("mari", "bzikadze", math.getId(), 1500.00));
        System.out.println(teacher);
        String subjectName = teacherService.getSubjectNameByTeacherId(teacher.getId());
        System.out.println(subjectName);
        System.out.println(studentDao.findAll());


    }
}