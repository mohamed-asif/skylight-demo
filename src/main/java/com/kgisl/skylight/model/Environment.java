package com.kgisl.skylight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Environment
 * @author Mohamed Asif J
 */
@Entity(name="environment")
public class Environment extends AuditEntity{

    private static final long serialVersionUID = 1L;

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO,generator = "envseqgenerator")
    // @SequenceGenerator(name = "envseqgenerator",sequenceName = "environmentseq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long environmentId;

    @Column
    private String environmentCode;
    @Column
    private String environmentName;

    /**
     * @return the environmentId
     */
    public Long getEnvironmentId() {
        return environmentId;
    }
    /**
     * @param environmentId the environmentId to set
     */
    public void setEnvironmentId(Long environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * @return the environmentCode
     */
    public String getEnvironmentCode() {
        return environmentCode;
    }
    /**
     * @param environmentCode the environmentCode to set
     */
    public void setEnvironmentCode(String environmentCode) {
        this.environmentCode = environmentCode;
    }

    /**
     * @return the environmentName
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    /**
     * @param environmentName the environmentName to set
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}