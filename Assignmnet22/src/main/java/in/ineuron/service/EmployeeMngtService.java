package in.ineuron.service;

import in.ineuron.model.Employee;

public interface EmployeeMngtService {

	public String insertEmployeeDetails(Employee employee);

	public Employee fetchEmpoyeeDetailsById(Integer id);
}
