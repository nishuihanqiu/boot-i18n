package com.lls.i18n.model;

import java.util.Date;

/************************************
 * I18nDO
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
public class I18nDO {

    private Long id;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    public I18nDO() {
    }

    public I18nDO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
