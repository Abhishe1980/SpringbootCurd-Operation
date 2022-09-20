package com.crud.sprngbootexample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.crud.sprngbootexample.entites.users;


public interface UserRepository extends CrudRepository<users , Integer> {
	
	public List<users> findByName(String name);
	
	
	@Query("Select u from users u")
    public List<users> getAllusers();
 
    @Query("Select u FROM users u WHERE u.name =:n and u.city=:c")
    public List<users> getusersByName(@Param("n")String name, @Param("c") String city);
    
    
    @Query(value="Select * from users"  , nativeQuery = true)
    public List<users> getUsers();
 
 
 
}
