package com.demoblaze.core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseUIObject {
    protected WebDriver driver;
    private static final int DEFAULT_TIMEOUT = 5;
    private static final int FLUENT_WAIT_TIMEOUT = 15;
    private static final int FLUENT_WAIT_POLLING = 500;

    protected BaseUIObject(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        waitForElementToBeClickable(locator).click();
    }

    protected void inputText(By locator, String text) {
        waitForElementToBeVisible(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return waitForElementToBeVisible(locator).getText();
    }



    private WebDriverWait getWait(int timeoutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
    }

    private WebDriverWait getWait() {
        return getWait(DEFAULT_TIMEOUT);
    }

    protected WebElement waitForElementToBeVisible(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitForElementToBeClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected Alert waitForAlertPresent() {
        return getWait().until(ExpectedConditions.alertIsPresent());
    }

    protected WebElement waitForElementToLoad(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIMEOUT))
                .pollingEvery(Duration.ofMillis(FLUENT_WAIT_POLLING))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
