package com.company.utilitylibrary.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|title")
@Table(name = "UTILITYLIBRARY_BOOK")
@Entity(name = "utilitylibrary_Book")
public class Book extends StandardEntity {
    private static final long serialVersionUID = -1270335811674644274L;

    @NotNull
    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Column(name = "PLACE_PUBLICATION")
    protected String place_publication;

    public String getPlace_publication() {
        return place_publication;
    }

    public void setPlace_publication(String place_publication) {
        this.place_publication = place_publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}