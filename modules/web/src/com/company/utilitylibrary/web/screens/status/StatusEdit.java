package com.company.utilitylibrary.web.screens.status;

import com.haulmont.cuba.gui.screen.*;
import com.company.utilitylibrary.entity.Status;

@UiController("utilitylibrary_Status.edit")
@UiDescriptor("status-edit.xml")
@EditedEntityContainer("statusDc")
@LoadDataBeforeShow
public class StatusEdit extends StandardEditor<Status> {
}