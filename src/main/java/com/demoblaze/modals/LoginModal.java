package com.demoblaze.modals;

import com.demoblaze.core.BaseModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModal extends BaseModal {

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    public void loginAs(String username, String password) {
        inputText(By.id("loginusername"), username);
        inputText(By.id("loginpassword"), password);
        click(By.xpath("//button[text()='Log in']"));
    }
}
