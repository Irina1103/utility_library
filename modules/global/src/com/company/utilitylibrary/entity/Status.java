package com.company.utilitylibrary.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|status")
@Table(name = "UTILITYLIBRARY_STATUS")
@Entity(name = "utilitylibrary_Status")
public class Status extends StandardEntity {
    private static final long serialVersionUID = -5545996909761665924L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TITLE_BOOK_ID")
    protected Book title_book;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_ID")
    protected User status;

    public User getStatus() {
        return status;
    }

    public void setStatus(User status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book getTitle_book() {
        return title_book;
    }

    public void setTitle_book(Book title_book) {
        this.title_book = title_book;
    }

}