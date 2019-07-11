package com.company.utilitylibrary.web.screens.author;

import com.haulmont.cuba.gui.screen.*;
import com.company.utilitylibrary.entity.Author;

@UiController("utilitylibrary_Author.edit")
@UiDescriptor("author-edit.xml")
@EditedEntityContainer("authorDc")
@LoadDataBeforeShow
public class AuthorEdit extends StandardEditor<Author> {
}