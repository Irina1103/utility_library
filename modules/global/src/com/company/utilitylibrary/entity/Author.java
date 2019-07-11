package com.company.utilitylibrary.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "UTILITYLIBRARY_AUTHOR")
@Entity(name = "utilitylibrary_Author")
public class Author extends StandardEntity {
    private static final long serialVersionUID = -7564289924190529616L;

    @NotNull
    @Column(name = "NAME_AUTHOR", nullable = false, length = 100)
    protected String name_author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TITLE_ID")
    protected Book title;

    public Book getTitle() {
        return title;
    }

    public void setTitle(Book title) {
        this.title = title;
    }

    public String getName_author() {
        return name_author;
    }

    public void setName_author(String name_author) {
        this.name_author = name_author;
    }
}