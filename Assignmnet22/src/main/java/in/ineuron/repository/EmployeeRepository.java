package in.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
