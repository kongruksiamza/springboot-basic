package com.kongruksiam.crudapp;

import com.kongruksiam.crudapp.entity.Person;
import com.kongruksiam.crudapp.repository.PersonDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(PersonDAO dao){
		return runner->{
			updateData(dao);
		};
	}

	public void saveData(PersonDAO dao){
		Person obj1=new Person("แก้ม","ใจดี");
		dao.save(obj1);
		System.out.println("Insert Complete");
	}

	public void deleteData(PersonDAO dao){
		int id=3;
		dao.delete(id);
		System.out.println("Delete Complete");
	}
	public void getData(PersonDAO dao){
		int id=1;
		Person person = dao.get(id);
		System.out.println(person);
	}
	public void getAllData(PersonDAO dao){
		List<Person> data = dao.getAll();
		for(Person person : data){
			System.out.println(person);
		}
	}
	public void updateData(PersonDAO dao){
		int id=4;
		Person myPerson = dao.get(id);
		myPerson.setFname("โจโจ้");
		myPerson.setLname("เรียนดี");
		dao.update(myPerson);
		System.out.println("Update Complete");
	}
}
