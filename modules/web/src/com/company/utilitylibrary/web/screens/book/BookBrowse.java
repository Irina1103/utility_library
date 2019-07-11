package com.company.utilitylibrary.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.company.utilitylibrary.entity.Book;

@UiController("utilitylibrary_Book.browse")
@UiDescriptor("book-browse.xml")
@LookupComponent("booksTable")
@LoadDataBeforeShow
public class BookBrowse extends StandardLookup<Book> {
}