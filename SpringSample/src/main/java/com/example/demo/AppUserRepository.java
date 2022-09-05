package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser,Long> {
	
	AppUser findById(long id);

}
