package com.crud.sprngbootexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.crud.sprngbootexample.entites.users;


public interface UserRepository extends CrudRepository<users , Integer> {

}
