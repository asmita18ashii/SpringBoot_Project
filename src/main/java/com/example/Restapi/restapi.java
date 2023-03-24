package com.example.Restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.Services;

@RestController
public class restapi {

	@Autowired
	public Services services;
	@PostMapping(path = "/add/apis", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> pushapi(@RequestBody Model model) {
			//return model
		
	return ResponseEntity.status(HttpStatus.CREATED).body(new Model().addAttribute("msg", "Created"));
	}
	
	@PostMapping("/create")
	public Model createStudent(@RequestBody Model model) {
		return services.createStudent(model);
	}
	
	@GetMapping("/getById/{id}")
	public Model getApiById(@PathVariable String id) {
		return services.getApiById(id);
	}
	@PostMapping("/getByMethodName")
    public List<Model> getByMethodName(@RequestBody Model model) {
        return services.findByMethodName(model.getMethodName());
    }
	@GetMapping("/getByApiName/{apiName}")
	public Model getApiByApiName(@PathVariable String apiName) {
		return services.getApiByApiName(apiName);
	}
}
