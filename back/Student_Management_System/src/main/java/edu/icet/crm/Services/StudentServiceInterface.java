package edu.icet.crm.Services;

import edu.icet.crm.Entity.StudentEntity;
import edu.icet.crm.Model.Student;

import java.util.List;

public interface StudentServiceInterface {
    void saveStudent(Student student);

    List<StudentEntity> getStudent();
}
