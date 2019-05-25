package com.paf.repository;

import com.paf.model.UserData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<UserData, Integer>{

	
	public UserData findByEmailId(String emailId);
	
}
