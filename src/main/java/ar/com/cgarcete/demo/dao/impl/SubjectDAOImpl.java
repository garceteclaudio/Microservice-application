package ar.com.cgarcete.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cgarcete.demo.dao.SubjectDAO;
import ar.com.cgarcete.demo.entity.Subject;
import ar.com.cgarcete.demo.repository.SubjectRepository;

@Service
public class SubjectDAOImpl implements SubjectDAO{
	
	@Autowired
	private SubjectRepository personRepository;

	@Override
	public List<Subject> findAll() {
		List<Subject> subjects = (List<Subject>) personRepository.findAll();
		return subjects;
	}

	@Override
	public Long save(Subject subject) {
		Subject result = personRepository.save(subject);
		return result.getId();
	}

	@Override
	public Subject findOne(Long id) {
		Subject subject = personRepository.findOne(id);
		return subject;
	}

}
