package com.pay.app.services;

import java.util.ArrayList;
import java.util.List;

import com.pay.app.entities.Category;
import com.pay.app.payloads.UserDto;
import com.pay.app.repositories.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
	@Autowired
	private CategoryRepo categoryRepo;
	public List<Category> getAllUsers() {
		
		List<Category> categories = this.categoryRepo.findAll();



		return categories;
	}

}
