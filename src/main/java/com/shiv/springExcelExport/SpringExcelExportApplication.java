package com.shiv.springExcelExport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shiv.springExcelExport.model.Student;
import com.shiv.springExcelExport.repository.studentRepository;

@SpringBootApplication
public class SpringExcelExportApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringExcelExportApplication.class, args);
	}


	@Autowired
	private studentRepository studentRepo;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(1,"Ganesh","Nd2 kranti chauk","Nanded","431603");
		Student student2 = new Student(2,"Manisha","C62 SHIVRAJ Nagar","Delhi","431603");
		
		studentRepo.save(student1);
		studentRepo.save(student2);
		
	}

}
