package com.demoblaze.tests;

import com.demoblaze.components.HeaderComponent;
import com.demoblaze.modals.LoginModal;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests extends BaseTest{

    @Test
    public void verifyUserCanSuccessfullyLoginWithValidCredentials(){
        SoftAssert softAssert = new SoftAssert();
        HeaderComponent header = homePage.getHeaderComponent();
        LoginModal loginModal = header.clickLogin();
        loginModal.loginAs("techbuyer_245", "Buy@Tech2025!");
        String welcomeMessage = header.getWelcomeMessage();
        boolean isLoginButtonVisible = header.isLoginButtonVisible();

        softAssert.assertEquals(welcomeMessage, "Welcome techbuyer_245", "The Welcome Message is incorrect");
        softAssert.assertFalse(isLoginButtonVisible, "Log In button is visible after login");
        softAssert.assertAll();
    }
}
