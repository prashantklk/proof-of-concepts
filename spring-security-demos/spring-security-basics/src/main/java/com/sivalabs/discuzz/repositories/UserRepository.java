package com.sivalabs.discuzz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sivalabs.discuzz.entities.User;

/**
 * @author Siva
 * 
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);

	@Query("select u from User u where u.email=?1 and u.password=?2")
	User login(String email, String password);

}
