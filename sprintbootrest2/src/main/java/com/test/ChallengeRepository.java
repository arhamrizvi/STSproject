package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

//what type of class you're working with
//what type of primary key it is
public interface ChallengeRepository extends CrudRepository<Challenge,Integer>{

}

