package ar.com.cgarcete.demo.repository;

import org.springframework.data.repository.CrudRepository;

import ar.com.cgarcete.demo.entity.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long>{

}
