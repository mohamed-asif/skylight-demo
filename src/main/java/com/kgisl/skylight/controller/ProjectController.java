package com.kgisl.skylight.controller;

import java.util.List;
import java.util.Optional;

import com.kgisl.skylight.model.Project;
import com.kgisl.skylight.service.ProjectService;

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
 * ProjectController
 * @author Mohamed Asif J
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/findall")
    public List<Project> retrieveAllProjects() {

        return projectService.findAllProject();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Project> retrieveProject(@PathVariable long id) {

        Optional<Project> findproject =  projectService.findProject(id);
        if(findproject.isPresent())
            return new ResponseEntity<>(findproject.get(),HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProject(@PathVariable long id) {

        projectService.deleteProject(id);
        return new ResponseEntity<>("Project has been deleted!",HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {

        Project createdproject = projectService.createProject(project);
        return new ResponseEntity<>(createdproject,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Project> updateProject(@RequestBody Project project) {
        
        Project updateProject =  projectService.updateProject(project);
        return new ResponseEntity<>(updateProject,HttpStatus.OK);
    }
}