package in.ineuron;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.IStudentService;
import in.ineuron.model.Student;

@SpringBootApplication
public class Assignmnet21Application {

	public static void main(String[] args) {
		Scanner scanner = null;
		ConfigurableApplicationContext context = null;
		try {
			context = SpringApplication.run(Assignmnet21Application.class, args);

			IStudentService service = context.getBean(IStudentService.class);

			scanner = new Scanner(System.in);

			System.out.println("Enter Name :");
			String name = scanner.nextLine();

			System.out.println("Enter Age :");
			String age = scanner.nextLine();

			System.out.println("Enter Address: ");
			String address = scanner.nextLine();

			Student student = new Student();
			student.setSname(name);
			student.setSaddress(address);
			student.setSage(Integer.parseInt(age));
			String status = service.insertStudentData(student);
			System.out.println(status);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			context.close();
		}

	}

}
