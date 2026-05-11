package DAO;

import db.DatabaseConnectionManager;
import models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplementation implements StudentDao{
    private final DatabaseConnectionManager dcm;
    private final String INSERT     = "INSERT INTO students (first_name, last_name, grade) VALUES (?, ?, ?) RETURNING id";
    private final String FIND_ALL   = "SELECT * FROM students";
    private final String FIND_BY_ID = "SELECT * FROM students WHERE id = ?";
    private final String UPDATE     = "UPDATE students SET first_name = ?, last_name = ?, grade = ? WHERE id = ?";
    private final String DELETE     = "DELETE FROM students WHERE id = ?";

    public StudentDaoImplementation() {
        this.dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "admin"
        );
    }
    @Override
    public Student create(Student student) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getGrade());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        student.getFirstName(),
                        student.getLastName(),
                        student.getGrade()
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                students.add(new Student(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("grade")
                ));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public Student findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("grade")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student update(Student student) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getGrade());
            ps.setInt(4, student.getId());
            ps.executeUpdate();

            return findById(student.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
