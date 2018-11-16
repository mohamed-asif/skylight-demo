package com.kgisl.skylight.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * AuditEntity
 * @author Mohamed Asif J
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value={"createUser","createDate","updateUser","updateDate"})
public  abstract class AuditEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "createdBy",nullable = false,updatable = false)
    @CreatedBy
    private String createUser;

    @Column(name = "createdOn",nullable = false,updatable = false)
    @CreatedDate
    private LocalDateTime  createDate;

    @Column(name = "updatedBy")
    @LastModifiedBy
    private String updateUser;

    @Column(name = "updatedOn")
    @LastModifiedDate
    private LocalDateTime updateDate;

   /* @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createDate = now;
        this.updateDate = now;
    }
     
    @PreUpdate
    public void preUpdate() {
        this.updateDate = LocalDateTime.now();
    } */

    /**
     * @return the createUser
     */
    public String getCreateUser() {
        return createUser;
    }
    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    /**
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;  
    }
    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    /**
     * @return the updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }
    /**
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    /**
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }
    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}