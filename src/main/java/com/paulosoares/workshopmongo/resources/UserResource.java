package com.paulosoares.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulosoares.workshopmongo.domain.User;
import com.paulosoares.workshopmongo.dto.UserDTO;
import com.paulosoares.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	UserService sercive;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = sercive.findAll();
		List<UserDTO> listDTO = list.stream().map(user -> new UserDTO(user)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		User obj = sercive.findById(id);
		return ResponseEntity.ok().body(new UserDTO(obj));
	}
	
	
}
