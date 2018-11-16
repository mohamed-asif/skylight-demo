package com.kgisl.skylight.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * Team
 * Mohamed Asif J
 */
@Entity
public class Team extends AuditEntity{

    private static final long serialVersionUID = 1L;

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO,generator = "teamgenerator")
    // @SequenceGenerator(name = "teamgenerator",sequenceName = "teamseq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    @Column
    private String teamCode;

    @Column
    private String teamName;

    // @OneToMany(cascade = CascadeType.DETACH,
    //         fetch = FetchType.LAZY, mappedBy = "team")
    // private Set<Project> projects;

    /**
     * @return the teamId
     */
    public Long getTeamId() {
        return teamId;
    }
    /**
     * @param teamId the teamId to set
     */
    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    /**
     * @return the teamCode
     */
    public String getTeamCode() {
        return teamCode;
    }
    /**
     * @param teamCode the teamCode to set
     */
    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }
    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the projects
     */ 
    // public Set<Project> getProjects() {
    //     return projects;
    // }
    /**
     * @param projects the projects to set
     */
    // public void setProjects(Set<Project> projects) {
    //     this.projects = projects;
    // }

}