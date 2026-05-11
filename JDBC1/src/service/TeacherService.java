package service;

import DAO.SubjectDao;
import DAO.TeacherDao;
import models.Subject;
import models.Teacher;

public class TeacherService {
    private final TeacherDao teacherDao;
    private final SubjectDao subjectDao;

    public TeacherService(TeacherDao teacherDao, SubjectDao subjectDao) {
        this.teacherDao = teacherDao;
        this.subjectDao = subjectDao;
    }
    public String getSubjectNameByTeacherId(int teacherId) {
        Teacher teacher = teacherDao.findById(teacherId);
        if (teacher == null) {
            return "could not find teacher";
        }

        Subject subject = subjectDao.findById(teacher.getSubjectId());
        if (subject == null) {
            return "could not find subject";
        }

        return subject.getSubjectName();
    }




}
