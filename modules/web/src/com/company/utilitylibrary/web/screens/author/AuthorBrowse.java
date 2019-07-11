package com.company.utilitylibrary.web.screens.author;

import com.haulmont.cuba.gui.screen.*;
import com.company.utilitylibrary.entity.Author;

@UiController("utilitylibrary_Author.browse")
@UiDescriptor("author-browse.xml")
@LookupComponent("authorsTable")
@LoadDataBeforeShow
public class AuthorBrowse extends StandardLookup<Author> {
}