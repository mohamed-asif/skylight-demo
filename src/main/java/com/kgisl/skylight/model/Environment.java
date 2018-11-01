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
public class Environment extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "envseqgenerator")
    @SequenceGenerator(name = "envseqgenerator",sequenceName = "environmentseq")
    private Long environmentId;

    @Column
    private String environmentCode;
    @Column
    private String environmentName;


    /**
     * @return the envId
     */
    public Long getEnvId() {
        return environmentId;
    }
    /**
     * @param envId the envId to set
     */
    public void setEnvId(Long environmentId) {
        this.environmentId = environmentId;
    }
    /**
     * @return the envCode
     */
    public String getEnvCode() {
        return environmentCode;
    }
    /**
     * @param envCode the envCode to set
     */
    public void setEnvCode(String environmentCode) {
        this.environmentCode = environmentCode;
    }
    /**
     * @return the envName
     */
    public String getEnvName() {
        return environmentName;
    }
    /**
     * @param envName the envName to set
     */
    public void setEnvName(String environmentName) {
        this.environmentName = environmentName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}