package com.crud5;

import com.crud5.model.Employee;
import com.crud5.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrud5Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrud5Application.class, args);
	}

    @Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("gosto");
		employee.setLastName("kindo");
		employee.setEmailId("gosto@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("fabio");
		employee1.setLastName("deno");
		employee1.setEmailId("fabio@gmail.com");
		employeeRepository.save(employee1);

	}
}
