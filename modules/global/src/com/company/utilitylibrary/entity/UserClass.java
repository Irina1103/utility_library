package com.company.utilitylibrary.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Column;
import javax.persistence.Entity;

@NamePattern("%s|status")
@Entity(name = "utilitylibrary$UserClass")
@Extends(User.class)
public class UserClass extends User {
    @Column(name = "Status", length = 100)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
