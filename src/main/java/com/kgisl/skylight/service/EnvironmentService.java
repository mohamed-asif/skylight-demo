package com.kgisl.skylight.service;

import java.util.List;

import com.kgisl.skylight.model.Environment;

/**
 * EnvironmentService
 * @author Mohamed Asif J
 */
public interface EnvironmentService {
    
    public List<Environment> findAllEnvironment();
    public Environment createEnvironment(Environment environment);
	public Environment findEnvironment(long id);
    public void deleteEnvironment(long id);
    public Environment updateEnvironment(Environment environment);
	//public List<Project> findByName(String name);
}