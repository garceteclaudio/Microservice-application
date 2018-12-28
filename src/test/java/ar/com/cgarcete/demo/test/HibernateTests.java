package ar.com.cgarcete.demo.test;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.transaction.annotation.Transactional;

import ar.com.cgarcete.demo.dao.PersonDAO;
import ar.com.cgarcete.demo.dao.impl.PersonDAOImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateTests {

	@Autowired
	private PersonDAO personService = new PersonDAOImpl();


	@Test
	@Transactional
	public void exampleTest() {
		//HAY UNA DEPENDENCIA CON LA BD -> @Transactional:

		System.out.println("\n\n:.................................................:\n\n");
		System.out.println("\n\n\n\n\n Objeto 1: "+personService.findOne(Long.valueOf(1))+"\n\n\n\n\n ");
		System.out.println("\n\n\n\n\n Cantidad de elementos: "+personService.findAll().size()+"\n\n\n\n\n");

	}



}
