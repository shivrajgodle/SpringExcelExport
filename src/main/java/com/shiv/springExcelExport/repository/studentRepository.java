package com.shiv.springExcelExport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiv.springExcelExport.model.Student;

@Repository
public interface studentRepository extends JpaRepository<Student , Long> {

}
