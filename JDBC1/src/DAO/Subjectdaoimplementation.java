package DAO;

import db.DatabaseConnectionManager;
import models.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Subjectdaoimplementation implements SubjectDao{
    private final DatabaseConnectionManager dcm;

    private final String INSERT  = "INSERT INTO subjects (subject_name) VALUES (?) RETURNING id";
    private final String FIND_ALL  = "SELECT * FROM subjects";
    private final String FIND_BY_ID = "SELECT * FROM subjects WHERE id = ?";
    private final String UPDATE  = "UPDATE subjects SET subject_name = ? WHERE id = ?";
    private final String DELETE  = "DELETE FROM subjects WHERE id = ?";
    public Subjectdaoimplementation() {
        this.dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "admin"
        );
    }
    @Override
    public Subject create(Subject subject) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, subject.getSubjectName());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Subject(rs.getInt("id"), subject.getSubjectName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Subject> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<Subject> subjects = new ArrayList<>();
            while (rs.next()) {
                subjects.add(new Subject(
                        rs.getInt("id"),
                        rs.getString("subject_name")
                ));
            }
            return subjects;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public Subject findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Subject(
                        rs.getInt("id"),
                        rs.getString("subject_name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, subject.getSubjectName());
            ps.setInt(2, subject.getId());
            ps.executeUpdate();

            return findById(subject.getId());
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
