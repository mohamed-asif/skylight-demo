package com.kgisl.skylight.repository;

import com.kgisl.skylight.model.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ProjectRepository
 * @author Mohamed Asif J
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    
}