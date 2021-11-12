package com.shiv.springExcelExport.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shiv.springExcelExport.excel.UserExcelReporter;
import com.shiv.springExcelExport.model.Student;
import com.shiv.springExcelExport.repository.studentRepository;



@Controller
@RequestMapping("/web")
public class HomeController {

	@RequestMapping("/home")
	public String homePage() {
		return "HomePage";
	}
	
	@Autowired
	private studentRepository studentrepo;
	
	
	@GetMapping("/export/excel")
	public void exportToExcel(HttpServletResponse responce) throws IOException{

		responce.setContentType("application/octet-stream");
		
		String headerkey = "content-disposition";
		String headervalue = "attachment; filename=Student_info.xlsx";
		
		responce.setHeader(headerkey, headervalue);
		
		List<Student> listStudent = studentrepo.findAll();
		
		UserExcelReporter exp = new UserExcelReporter(listStudent);
		exp.export(responce);
		
		
		
		
		
	}
}
