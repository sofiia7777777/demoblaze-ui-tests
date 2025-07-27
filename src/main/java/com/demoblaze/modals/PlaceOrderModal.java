package com.demoblaze.modals;

import com.demoblaze.core.BaseModal;
import com.demoblaze.model.OrderFormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderModal extends BaseModal {

    public PlaceOrderModal(WebDriver driver) {
        super(driver);
    }

    public ConfirmationModal submitOrderForm(OrderFormData data) {
        inputText(By.id("name"), data.getName());
        inputText(By.id("country"), data.getCountry());
        inputText(By.id("city"), data.getCity());
        inputText(By.id("card"), data.getCreditCard());
        inputText(By.id("month"), data.getMonth());
        inputText(By.id("year"), data.getYear());
        click(By.xpath("//button[normalize-space()='Purchase']"));
        return new ConfirmationModal(driver);
    }

}
