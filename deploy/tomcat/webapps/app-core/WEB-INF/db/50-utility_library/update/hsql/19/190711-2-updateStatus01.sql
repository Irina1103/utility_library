alter table UTILITYLIBRARY_STATUS add constraint FK_UTILITYLIBRARY_STATUS_ON_USER foreign key (USER_ID) references SEC_USER(ID);
