package com.example.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Restapi.Model;
import com.example.Restapi.repository.ModelRepository;

import org.springframework.stereotype.Component;

@Component

@Service
public class Services {
	@Autowired
	ModelRepository modelRepository;
	
	public Model createStudent (Model model) {
		return modelRepository.save(model);
	}
	public Model getApiById(String id) {
		return modelRepository.findById(id).get();
	}
	public Model getApiByMethodName(String methodName) {
		return modelRepository.findByMethodName(methodName).get(0);
	}
	public Model getApiByApiName(String methodName) {
		return modelRepository.findApiByApiName(methodName).get(0);
	}
	public List<Model> findByMethodName(String methodName) {
		// TODO Auto-generated method stub
		return modelRepository.findByMethodName(methodName);
	}
}

                                                       