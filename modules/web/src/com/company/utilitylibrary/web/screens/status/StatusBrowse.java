package com.company.utilitylibrary.web.screens.status;

import com.haulmont.cuba.gui.screen.*;
import com.company.utilitylibrary.entity.Status;

@UiController("utilitylibrary_Status.browse")
@UiDescriptor("status-browse.xml")
@LookupComponent("statusesTable")
@LoadDataBeforeShow
public class StatusBrowse extends StandardLookup<Status> {
}