package com.paulosoares.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulosoares.workshopmongo.domain.User;
import com.paulosoares.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	UserService sercive;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = sercive.findAll();
		return ResponseEntity.ok().body(list);
	}

}
