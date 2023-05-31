package in.ineuron.service;

import java.util.List;

import in.ineuron.dto.Student;
import in.ineuron.dao.IStudentImpl;

public class IStudentServiceImpl implements IStudentService {

	@Override
	public List<Student> fetchAllStudentDat() {

		IStudentImpl dao = new IStudentImpl();

		return dao.fetchAllStudentDat();
	}

}
