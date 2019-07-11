package com.company.utilitylibrary.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.company.utilitylibrary.entity.Book;

@UiController("utilitylibrary_Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
@LoadDataBeforeShow
public class BookEdit extends StandardEditor<Book> {
}