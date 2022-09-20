package com.crud.sprngbootexample;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.crud.sprngbootexample.dao.UserRepository;
import com.crud.sprngbootexample.entites.users;

@SpringBootApplication
public class SprngbootexampleApplication {

	public static void main(String[] args) {
		
   ApplicationContext  context=SpringApplication.run(SprngbootexampleApplication.class, args);
		
   UserRepository    UserRepository= context.getBean(UserRepository.class );
   
	/*
	 * users user=new users(); user.setName("Abhishek Tiwari");
	 * user.setCity("Noida"); user.setStatus("I am a FullStack Devloper");
	 * 
	 * 
	 * users user1=UserRepository.save(user); System.out.println(user1);
	 */
   
   //Create Object of users
   
	/*
	 * users user1=new users(); user1.setName("Ankit Tiwari");
	 * user1.setCity("Noida34"); user1.setStatus("I am a Devloper");
	 * 
	 * users user2=new users(); user2.setName("Sonu"); user2.setCity("City2");
	 * user2.setStatus("I am a java Devloper");
	 */
   // Saving single user
  // users resultuser=UserRepository.save(user2);
   
	/*
	 * List<users>users= List.of(user1,user2); Iterable<users>
	 * result=UserRepository.saveAll(users);
	 * 
	 * result.forEach(user->{
	 * 
	 * 
	 * }); System.out.println(users);
	 * 
	 * 
	 * 
	 * // System.out.println("Save user"+resultuser); System.out.println("Done");
	 */
   
   //update the user of id 5
  // java.util.Optional<users> optional=UserRepository.findById(6);
   //users user = optional.get();
   
  //user.setName("Kittu Tiwari");
 //users Result= UserRepository.save(user);
   
   //System.out.println(Result);
   
   //Iterable<users> itr =UserRepository.findAll();
   //itr.forEach(users->{System.out.println(users);});
   //Delete the user Element
   
  // UserRepository.deleteById(5);
   //System.out.println("deleted");
   
//   Iterable<users> allUsers =UserRepository.findAll();
//   allUsers.forEach(user->System.out.println(user));
//   UserRepository.deleteAll(allUsers);
   
 // List<users>user= UserRepository.findByName("Ankit");
  //user.forEach(e->System.out.println(e));
    
   List<users>alluser= UserRepository.getAllusers(); 
   alluser.forEach(e->{
	   System.out.println(e);
   }); 
   
   System.out.println("______________________________________________");   
   List<users>userByName=UserRepository.getusersByName("Abhishek","city");
   userByName.forEach(e->{
	   System.out.println(e);
   });
   
   
   System.out.println("______________________________________________");   
   
   UserRepository.getUsers().forEach(e-> System.out.println(e));
	}
}
