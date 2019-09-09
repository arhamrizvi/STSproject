package com.test;
//Controller
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //whenever you want to implement restful api, you have to annotate it with rest controller: basically exposes rest services
public class ChallengeResource {
	
	@Autowired
	ChallengeRepository repo;
	
	@GetMapping("challenges") //will use GET 
	public List<Challenge> getChallenges(){
		List<Challenge> challenges = (List<Challenge>) repo.findAll();
		
		return challenges;
	}
	
	@GetMapping("challenges/{id}")
	//@PathParam
	public Optional<Challenge> getChallenges(@PathVariable int id){
		return repo.findById(id);
	}
	
}
