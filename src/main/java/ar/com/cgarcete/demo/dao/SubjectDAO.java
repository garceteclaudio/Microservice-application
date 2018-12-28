package ar.com.cgarcete.demo.dao;

import java.util.List;

import ar.com.cgarcete.demo.entity.Subject;

public interface SubjectDAO {

	List<Subject> findAll();
	
	Long save(Subject subject);
	
	Subject findOne(Long id);
}
