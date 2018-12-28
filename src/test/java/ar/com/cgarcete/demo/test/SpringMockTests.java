package ar.com.cgarcete.demo.test;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.*;

import ar.com.cgarcete.demo.dao.PersonDAO;
import ar.com.cgarcete.demo.dao.impl.PersonDAOImpl;
import ar.com.cgarcete.demo.entity.Person;
import ar.com.cgarcete.demo.repository.PersonRepository;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMockTests {

	// mock application context.
	
	//RemoteService
	@MockBean
	private PersonRepository personRepository;

	//reverser
	@Autowired
	private PersonDAO personService = new PersonDAOImpl();
	
	@Test
	public void exampleTest() {
		// RemoteService has been injected into the reverser bean
		given(personRepository.findOne(1l)).willReturn(new Person("pepa", "pig"));
		String name = personService.findOne(1l).getName();
		assertThat(name).isEqualTo("pepa");
	}
}