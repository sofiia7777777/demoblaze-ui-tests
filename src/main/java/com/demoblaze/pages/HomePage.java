package com.demoblaze.pages;

import com.demoblaze.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void selectCategory(String text) {
        By categoryLink = By.linkText(text);
        click(categoryLink);
    }

    public ProductPage selectProduct(String text) {
        By productLink = By.linkText(text);
        waitForElementToLoad(productLink).click();
        return new ProductPage(driver);
    }
}
