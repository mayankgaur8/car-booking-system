package com.avantika.carbookingapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.avantika.carbookingapp.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
