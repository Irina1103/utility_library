alter table UTILITYLIBRARY_STATUS alter column USER_ID rename to USER_ID__U85925 ^
alter table UTILITYLIBRARY_STATUS alter column USER_ID__U85925 set null ;
drop index IDX_UTILITYLIBRARY_STATUS_ON_USER ;
alter table UTILITYLIBRARY_STATUS drop constraint FK_UTILITYLIBRARY_STATUS_ON_USER ;
alter table UTILITYLIBRARY_STATUS add column STATUS_ID varchar(36) ;
