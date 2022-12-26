package com.example.habilitacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.habilitacion.entities.*;


public interface NewsRepository  extends JpaRepository< News , Integer>{
	
	/*
	public Optional<User> findByUsername(String username);
	*/
	

}
