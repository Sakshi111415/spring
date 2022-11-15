package com.springboot.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;



@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		/*
		For setting values.................
		 
		User user=new User();
		user.setName("sakshi");
		user.setCity("kanpur");
		user.setStatus("developer");
		
	
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
			single user....................
		
		User resultuser = userRepository.save(user1);
		System.out.println("saved user" + resultuser);	
		*/
		
		
		/* SAVING MORE THAN ONE...................................
		User user1=new User();
		user1.setName("Ankita");
		user1.setCity("delhi");
		user1.setStatus("tester");
		
		User user2=new User();
		user2.setName("nidhi");
		user2.setCity("gurgaon");
		user2.setStatus("database");
		
		/* for saving more than one........*/
		/*
		
		Iterable<User> result= userRepository.saveAll(users);
		result.forEach(user-> {
			System.out.println(user);
		});
 */
		
		/* FOR UPDATE CRUD OPERATIONS...............*/
		
		/* Optional<User> optional= userRepository.findById(2);
		User user = optional.get();
		user.setName("namisha");
		
		User result = userRepository.save(user);
		System.out.println(result);
		*/
		/*  for reading............................*/
	
		/*
		Iterable <User> itr= userRepository.findAll();
		itr.forEach(user-> {System.out.println(user);});
		*/
		
		/*  for deleting by id*/
	/*
		userRepository.deleteById(3);
		System.out.println("deleted");
		*/

		/*  for deleting all*/
	
		Iterable<User> allusers= userRepository.findAll();
		allusers.forEach(user->System.out.println(user));
		userRepository.deleteAll(allusers);
	
	}

}
