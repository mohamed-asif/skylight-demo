package com.kgisl.skylight.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * BaseEntity
 * @author Mohamed Asif J
 */
@MappedSuperclass
public  abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "createdBy",updatable = false)
    private String createUser;

    @Column(name = "createdOn",updatable = false)
    private Timestamp createDate;

    @Column(name = "updatedBy")
    private String updateUser;

    @Column(name = "updatedOn")
    private Timestamp updateDate;

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
    public Timestamp getCreateDate() {
        return createDate;
    }
    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Timestamp createDate) {
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
    public Timestamp getUpdateDate() {
        return updateDate;
    }
    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
}