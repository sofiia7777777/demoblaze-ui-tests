package com.demoblaze.components;

import com.demoblaze.core.BaseComponent;
import com.demoblaze.modals.LoginModal;
import com.demoblaze.pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent extends BaseComponent {

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public CartPage clickCart() {
        click(By.id("cartur"));
        return new CartPage(driver);
    }

    public LoginModal clickLogin() {
        click(By.id("login2"));
        return new LoginModal(driver);
    }

    public String getWelcomeMessage() {
        return getText(By.id("nameofuser"));
    }

    public boolean isLoginButtonVisible() {
        WebElement loginButton = find(By.id("login2"));
        return loginButton.isDisplayed();
    }
}
