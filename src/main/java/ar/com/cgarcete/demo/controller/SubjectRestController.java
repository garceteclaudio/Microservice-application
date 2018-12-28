package ar.com.cgarcete.demo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cgarcete.demo.dao.SubjectDAO;
import ar.com.cgarcete.demo.entity.Subject;

@RestController 
@RequestMapping(path="/subject")
public class SubjectRestController {

	private Logger logger = Logger.getLogger(SubjectRestController.class);
	
	@Autowired
	private SubjectDAO subjectService;
	
	@GetMapping
	public ResponseEntity<?> getAllSubjects(){
		logger.info("Get HTTP method - getAllSubjects();");
		
		List<Subject> listOfSubjects = subjectService.findAll();
		
		if(listOfSubjects.size()==0) {
			return new ResponseEntity<>(listOfSubjects, HttpStatus.NO_CONTENT);
		}
		else if(listOfSubjects.size()>=1) {
			return new ResponseEntity<>(listOfSubjects, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Subject subject){
		logger.info("POST - "	+	subject.toString());
		subjectService.save(subject);
		return new ResponseEntity<>("Materia creada con ID: " + subject.getId(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id) {
		logger.info("GET ID:  - "	+ id);
		Subject subject = subjectService.findOne(id);
		
		return new ResponseEntity<>(subject, HttpStatus.OK);
	}
	
}
