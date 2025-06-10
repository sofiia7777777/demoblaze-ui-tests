package com.demoblaze.pages;

import com.demoblaze.core.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        By addToCartButton = By.cssSelector("a.btn.btn-success.btn-lg");
        click(addToCartButton);
    }

    public void handleAlert() {
        Alert alert = waitForAlertPresent();
        alert.accept();
    }
}
