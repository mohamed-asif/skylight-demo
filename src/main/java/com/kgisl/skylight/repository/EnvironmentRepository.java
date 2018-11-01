
package com.kgisl.skylight.repository;

import com.kgisl.skylight.model.Environment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EnvironmentRepository
 * @author Mohamed Asif J
 */
@Repository
public interface EnvironmentRepository extends JpaRepository<Environment,Long> {
    
}