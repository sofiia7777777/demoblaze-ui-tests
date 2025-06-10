package com.demoblaze.core;

import org.openqa.selenium.WebDriver;

public abstract class BaseComponent extends BaseUIObject {

    protected BaseComponent(WebDriver driver) {
        super(driver);
    }
}
