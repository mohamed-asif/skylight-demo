package com.kgisl.skylight.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import com.kgisl.skylight.model.Environment;
import com.kgisl.skylight.repository.EnvironmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EnvironmentServiceImpl
 * @author Mohamed Asif J
 */
@Service
public class EnvironmentServiceImpl implements EnvironmentService {

    @Autowired 
    private EnvironmentRepository  environmentRepository;

    @Override
    public List<Environment> findAllEnvironment() {
        return environmentRepository.findAll();
    }

    @Override
    public Environment createEnvironment(Environment environment) {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        environment.setCreateDate(time);
        return environmentRepository.save(environment);
    }
    
    @Override
    public Environment findEnvironment(long id) {
        Optional<Environment> environment = environmentRepository.findById(id);
        return environment.get();
    }

    @Override
    public void deleteEnvironment(long id) {
        environmentRepository.deleteById(id);
    }

    @Override
    public Environment updateEnvironment(Environment environment) {
        
       return environmentRepository.save(environment);
    }

}