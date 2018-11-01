package com.kgisl.skylight.service;

import java.util.List;

import com.kgisl.skylight.model.Project;

/**
 * ProjectService
 * @author Mohamed Asif J
 */
public interface ProjectService {
    
    public List<Project> findAllProject();
    public Project createProject(Project project);
	public Project findProject(long id);
    public void deleteProject(long id);
    public Project updateProject(Project project);
}