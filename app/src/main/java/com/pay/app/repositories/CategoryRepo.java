package com.pay.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pay.app.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	

}
