package DAO;

import models.Subject;

import java.util.List;

public interface SubjectDao {
    Subject create(Subject subject);
    List<Subject> findAll();
    Subject findById(int id);
    Subject update(Subject subject);
    void delete(int id);
}
