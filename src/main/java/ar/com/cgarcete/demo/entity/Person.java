package ar.com.cgarcete.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Person {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotEmpty(message="El campo name es obligatorio")
	private String name;
	private String lastName;
	private String email;
	private Boolean isStudent;
	@OneToOne(cascade = CascadeType.ALL)
	private Work work;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Subject> subjects = new ArrayList<Subject>();	
	
	
	public Person() {		
	}
	
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public Boolean getIsStudent() {
		return isStudent;
	}

	public void setIsStudent(Boolean isStudent) {
		this.isStudent = isStudent;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", isStudent="
				+ isStudent + ", work=" + work + ", subjects=" + subjects + "]";
	}
	
	

	
}
