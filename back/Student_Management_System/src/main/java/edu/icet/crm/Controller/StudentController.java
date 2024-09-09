package edu.icet.crm.Controller;

import edu.icet.crm.Entity.StudentEntity;
import edu.icet.crm.Model.Student;
import edu.icet.crm.Services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentServiceInterface ssi;

    @PostMapping("/saveStudent")
    public Map<String, String> saveStudent(@RequestBody Student student)
    {
       ssi.saveStudent(student);
        return Collections.singletonMap("Status","Student Created");
    }

    @GetMapping("/getStudent")
    public List<StudentEntity> getStudent()
    {
       return  ssi.getStudent();
    }

}
