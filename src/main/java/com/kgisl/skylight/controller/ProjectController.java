package com.kgisl.skylight.controller;

import java.util.List;

import com.kgisl.skylight.model.Project;
import com.kgisl.skylight.service.ProjectService;

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
 * ProjectController
 * @author Mohamed Asif J
 */
@RestController
@RequestMapping(value = "/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/findall")
    public List<Project> retrieveAllProjects() {

        return projectService.findAllProject();
    }

    @GetMapping("/find/{id}")
    public Project retrieveProject(@PathVariable long id) {

        return projectService.findProject(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable long id) {
        projectService.deleteProject(id);
    }

    @PostMapping("/create")
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }

    @PutMapping("/update/{id}")
    public void updateProject(@RequestBody Project project) {
        projectService.updateProject(project);
    }
}