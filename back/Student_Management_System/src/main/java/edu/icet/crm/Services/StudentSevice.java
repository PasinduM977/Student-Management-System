package edu.icet.crm.Services;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.Entity.StudentEntity;
import edu.icet.crm.Model.Student;
import edu.icet.crm.Repositary.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSevice implements StudentServiceInterface{
    @Autowired
    ObjectMapper mapper;

@Autowired
    StudentRepository repository;

    @Override
    public void saveStudent(Student student) {
        StudentEntity stuEntity = mapper.convertValue(student, StudentEntity.class);
        repository.save(stuEntity);

    }

    @Override
    public List<StudentEntity> getStudent() {
       return (List<StudentEntity>) repository.findAll();
    }
}
