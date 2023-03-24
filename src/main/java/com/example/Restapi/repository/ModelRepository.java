package com.example.Restapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Restapi.Model;


@Repository
public interface ModelRepository extends MongoRepository<Model, String> {

	List<Model> findByMethodName(String methodName);
	List<Model> findApiByApiName(String apiName);

}

