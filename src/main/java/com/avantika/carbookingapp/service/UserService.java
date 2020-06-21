package com.avantika.carbookingapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avantika.carbookingapp.model.User;
import com.avantika.carbookingapp.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	public UserRepository userRepository;
	
	public UserService(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
	
	public void saveCabUserDeatils(User user)
	{
		userRepository.save(user);
	}
	
	public List<User>showAllAvailableCabs()
	{
		List<User>users=new ArrayList<User>();
		for(User user:userRepository.findAll())
		{
			users.add(user);
		}
		return users;
	}
	
	public void deleteCabBooked(int id)
	{
		userRepository.deleteById(id);
	}
}
