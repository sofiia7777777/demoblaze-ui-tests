package com.demoblaze.modals;

import com.demoblaze.core.BaseModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderModal extends BaseModal {

    public PlaceOrderModal(WebDriver driver) {
        super(driver);
    }

    public ConfirmationModal submitOrderForm(String name, String country, String city, String creditCard, String month, String year) {
        inputText(By.id("name"), name);
        inputText(By.id("country"), country);
        inputText(By.id("city"), city);
        inputText(By.id("card"), creditCard);
        inputText(By.id("month"), month);
        inputText(By.id("year"), year);
        click(By.xpath("//button[text()='Purchase']"));
        return new ConfirmationModal(driver);
    }

}
