package in.ineuron.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Employee;
import in.ineuron.repository.EmployeeRepository;
import in.ineuron.model.*;

@Service
public class EmployeeMngtServiceImpl implements EmployeeMngtService {
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public String insertEmployeeDetails(Employee employee) {
		Integer id = emprepo.save(employee).getId();
		if (id != null)
			return "Data is saved with id " + id;
		else
			return "Data Insertion failed";
	}

	@Override
	public Employee fetchEmpoyeeDetailsById(Integer id) {
		Optional<Employee> res = emprepo.findById(id);
		if (res.isPresent())
			return res.get();
		else
			throw new IllegalArgumentException("Please enter valid id");
	}
}
