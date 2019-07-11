create table UTILITYLIBRARY_AUTHOR_BOOK_LINK (
    AUTHOR_ID varchar(36) not null,
    BOOK_ID varchar(36) not null,
    primary key (AUTHOR_ID, BOOK_ID)
);
