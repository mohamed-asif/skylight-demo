package com.kgisl.skylight.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import com.kgisl.skylight.model.Project;
import com.kgisl.skylight.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProjectServiceImpl
 * @author Mohamed Asif J
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired 
    private ProjectRepository  projectRepository;

    @Override
    public List<Project> findAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public Project createProject(Project project) {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        project.setCreateDate(time);
        return projectRepository.save(project);
    }
    
    @Override
    public  Optional<Project> findProject(long id) {

        return projectRepository.findById(id);
    }

    @Override
    public void deleteProject(long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project updateProject(Project project) {
        
       return projectRepository.save(project);
    }

}