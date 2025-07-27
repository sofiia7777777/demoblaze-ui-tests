package com.demoblaze.pages;

import com.demoblaze.core.BasePage;
import com.demoblaze.modals.PlaceOrderModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        By productName = By.cssSelector("#tbodyid tr.success td:nth-child(2)");
        return waitForElementToLoad(productName).getText();
    }

    public String getProductPrice() {
        By productPrice = By.cssSelector("#tbodyid tr.success td:nth-child(3)");
        return waitForElementToLoad(productPrice).getText();
    }

    public PlaceOrderModal placeAnOrder() {
        By placeOrderButton = By.xpath("//button[normalize-space()='Place Order']");
        click(placeOrderButton);
        return new PlaceOrderModal(driver);
    }
}
