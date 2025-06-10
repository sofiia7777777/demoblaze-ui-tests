package com.demoblaze.core;

import com.demoblaze.components.HeaderComponent;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends BaseUIObject {

    protected BasePage(WebDriver driver) {
        super(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return new HeaderComponent(driver);
    }
}
