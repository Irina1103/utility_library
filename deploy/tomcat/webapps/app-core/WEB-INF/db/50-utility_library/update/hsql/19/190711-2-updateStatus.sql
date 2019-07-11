alter table UTILITYLIBRARY_STATUS alter column USER_ID rename to USER_ID__U99237 ^
alter table UTILITYLIBRARY_STATUS alter column USER_ID__U99237 set null ;
drop index IDX_UTILITYLIBRARY_STATUS_ON_USER ;
-- alter table UTILITYLIBRARY_STATUS add column USER_ID varchar(36) ^
-- update UTILITYLIBRARY_STATUS set USER_ID = <default_value> ;
-- alter table UTILITYLIBRARY_STATUS alter column USER_ID set not null ;
alter table UTILITYLIBRARY_STATUS add column USER_ID varchar(36) not null ;
