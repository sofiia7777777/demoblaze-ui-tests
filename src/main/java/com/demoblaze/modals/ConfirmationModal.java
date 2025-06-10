package com.demoblaze.modals;

import com.demoblaze.core.BaseModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationModal extends BaseModal {

    public ConfirmationModal(WebDriver driver) {
        super(driver);
    }

    public String getConfirmationMessage() {
        return getText(By.cssSelector("div.sweet-alert > h2"));
    }

    public String getPurchaseDetails() {
        return getText(By.cssSelector(".lead.text-muted"));
    }
}
