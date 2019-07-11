-- begin UTILITYLIBRARY_STATUS
create table UTILITYLIBRARY_STATUS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE_BOOK_ID varchar(36) not null,
    DATE_ date,
    STATUS_ID varchar(36),
    --
    primary key (ID)
)^
-- end UTILITYLIBRARY_STATUS
-- begin UTILITYLIBRARY_BOOK
create table UTILITYLIBRARY_BOOK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    PLACE_PUBLICATION varchar(255),
    --
    primary key (ID)
)^
-- end UTILITYLIBRARY_BOOK
-- begin UTILITYLIBRARY_AUTHOR
create table UTILITYLIBRARY_AUTHOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_AUTHOR varchar(100) not null,
    TITLE_ID varchar(36),
    --
    primary key (ID)
)^
-- end UTILITYLIBRARY_AUTHOR

-- begin SEC_USER
alter table SEC_USER add column STATUS varchar(100) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'utilitylibrary$UserClass' where DTYPE is null ^
-- end SEC_USER
