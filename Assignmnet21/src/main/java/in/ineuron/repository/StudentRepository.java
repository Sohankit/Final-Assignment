package in.ineuron.repository;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
