package com.kgisl.skylight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Project
 * @author Mohamed Asif J
 */
@Entity(name = "project")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Project extends AuditEntity {

    private static final long serialVersionUID = 1L;
    
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO,generator = "projectgenerator")
    // @SequenceGenerator(name = "projectgenerator",sequenceName = "projectseq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @Column
    private String projectCode;

    @Column
    private String projectName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teamId", nullable = false)
    private Team team;

    /**
     * @return the projectId
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the projectCode
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * @param projectCode the projectCode to set
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    /**
     * @return the team
     */
    public Team getTeam() {
        return team;
    }
    /**
     * @param team the team to set
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}