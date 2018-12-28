package ar.com.cgarcete.demo.repository;

import org.springframework.data.repository.CrudRepository;

import ar.com.cgarcete.demo.entity.Person;


//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface PersonRepository  extends CrudRepository<Person, Long>{

}
