package DAO;

import db.DatabaseConnectionManager;
import models.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImplementation implements TeacherDao {
    private final DatabaseConnectionManager dcm;
    private final String INSERT     = "INSERT INTO teachers (first_name, last_name, subject, salary) VALUES (?, ?, ?, ?) RETURNING id";
    private final String FIND_ALL   = "SELECT * FROM teachers";
    private final String FIND_BY_ID = "SELECT * FROM teachers WHERE id = ?";
    private final String UPDATE     = "UPDATE teachers SET first_name = ?, last_name = ?, subject = ?, salary = ? WHERE id = ?";
    private final String DELETE     = "DELETE FROM teachers WHERE id = ?";

    public TeacherDaoImplementation() {
        this.dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "admin"
        );
    }
    @Override
    public Teacher create(Teacher teacher) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getLastName());
            ps.setInt(3, teacher.getSubjectId());
            ps.setDouble(4, teacher.getSalary());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Teacher(
                        rs.getInt("id"),
                        teacher.getFirstName(),
                        teacher.getLastName(),
                        teacher.getSubjectId(),
                        teacher.getSalary()
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Teacher> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<Teacher> teachers = new ArrayList<>();
            while (rs.next()) {
                teachers.add(new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject_id"),
                        rs.getDouble("salary")
                ));
            }
            return teachers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public Teacher findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject"),
                        rs.getDouble("salary")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public Teacher update(Teacher teacher) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getLastName());
            ps.setInt(3, teacher.getSubjectId());
            ps.setDouble(4, teacher.getSalary());
            ps.setInt(5, teacher.getId());
            ps.executeUpdate();

            return findById(teacher.getId());
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
