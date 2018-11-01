package com.kgisl.skylight.controller;

import java.util.List;

import com.kgisl.skylight.model.Environment;
import com.kgisl.skylight.service.EnvironmentService;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "api/environment")
public class EnvironmentController {

    @Autowired
    private EnvironmentService environmentService;

    @GetMapping("/findall")
    public List<Environment> retrieveAllEnvironments() {

        return environmentService.findAllEnvironment();
    }

    @GetMapping("/find/{id}")
    public Environment retrieveEnvironment(@PathVariable long id) {

        return environmentService.findEnvironment(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnvironment(@PathVariable long id) {
        environmentService.deleteEnvironment(id);
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