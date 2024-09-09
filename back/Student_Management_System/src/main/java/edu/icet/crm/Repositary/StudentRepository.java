package edu.icet.crm.Repositary;

import edu.icet.crm.Entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Long> {
}
