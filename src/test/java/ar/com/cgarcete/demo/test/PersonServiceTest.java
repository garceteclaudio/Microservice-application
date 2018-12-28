package ar.com.cgarcete.demo.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ar.com.cgarcete.demo.dao.PersonDAO;
import ar.com.cgarcete.demo.dao.impl.PersonDAOImpl;
import ar.com.cgarcete.demo.entity.Person;
import ar.com.cgarcete.demo.repository.PersonRepository;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

	@Mock
	private PersonRepository personRepository;

	@InjectMocks
	private PersonDAO personService = new PersonDAOImpl();

	@Test
	@Ignore
	public void findOnePersonOk() {
		when(personRepository.findOne(1L)).thenReturn(new Person());
		Person person = personService.findOne(1L);	
		assertNotNull(person);
	}

	@Test
	public void deletePerson() {
		Person person = new Person();
		person.setName("Claudio");
		person.setIsStudent(true);
		when(personRepository.findOne(1L)).thenReturn(person);
		Person mockedPerson = personService.findOne(1L);
		
		assertNotNull(mockedPerson);

		Optional<Person> deletePerson = personService.delete(1L);
		
		assertTrue(deletePerson.isPresent());
		assertFalse(deletePerson.get().getIsStudent());
	}

}
