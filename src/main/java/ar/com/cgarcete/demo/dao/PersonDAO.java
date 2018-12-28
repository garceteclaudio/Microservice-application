package ar.com.cgarcete.demo.dao;

import java.util.List;
import java.util.Optional;

import ar.com.cgarcete.demo.entity.Person;

public interface PersonDAO {
	
	List<Person> findAll();
	
	Long save(Person person);

	Person findOne(Long id);

	Optional<Person> update(Long id, Person person);
	
	Optional<Person> delete(Long id);

	Optional<Person> findOnee(Long id);
}
