package com.kgisl.skylight.controller;

import java.util.List;
import java.util.Optional;

import com.kgisl.skylight.model.Environment;
import com.kgisl.skylight.service.EnvironmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EnvironmentController
 * @author Mohamed Asif J
 */
@RestController
@RequestMapping("/environment")
public class EnvironmentController {

    @Autowired
    private EnvironmentService environmentService;

    @GetMapping("/findall")
    public List<Environment> retrieveAllEnvironments() {

        return environmentService.findAllEnvironment();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Environment> retrieveEnvironment(@PathVariable long id) {

        Optional<Environment> findedEnvironment = environmentService.findEnvironment(id);
        
        if(findedEnvironment.isPresent())
            return new ResponseEntity<>(findedEnvironment.get(),HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEnvironment(@PathVariable long id) {
        environmentService.deleteEnvironment(id);
        return new ResponseEntity<>("Environment has been deleted!",HttpStatus.OK);
    }

    @PostMapping("/create")
    public void createEnvironment(@RequestBody Environment environment) {
        environmentService.createEnvironment(environment);
    }

    @PutMapping("/update/{id}")
    public void updateEnvironment(@RequestBody Environment environment) {
        environmentService.updateEnvironment(environment);
    }
}