package com.demoblaze.tests;

import com.demoblaze.components.HeaderComponent;
import com.demoblaze.modals.ConfirmationModal;
import com.demoblaze.modals.PlaceOrderModal;
import com.demoblaze.model.OrderFormData;
import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrderTests extends BaseTest{

    @Test
    public void verifyUserCanPurchaseProductSuccessfully(){
        SoftAssert softAssert = new SoftAssert();
        homePage.selectCategory("Phones");
        ProductPage productPage = homePage.selectProduct("Samsung galaxy s6");
        productPage.addToCart();
        productPage.handleAlert();
        HeaderComponent header = productPage.getHeaderComponent();
        CartPage cartPage = header.clickCart();
        PlaceOrderModal placeOrderModal = cartPage.placeAnOrder();
        OrderFormData order = new OrderFormData("John", "Ukraine", "Kyiv", "4111111111111111", "June", "2025");
        ConfirmationModal confirmationModal = placeOrderModal.submitOrderForm(order);
        String confirmationMessage = confirmationModal.getConfirmationMessage();
        String purchaseDetails = confirmationModal.getPurchaseDetails();
        boolean isIdVisible = purchaseDetails.contains("Id:");
        boolean isAmountVisible = purchaseDetails.contains("Amount:");
        boolean isCardNumberVisible = purchaseDetails.contains("Card Number:");

        softAssert.assertEquals(confirmationMessage, "Thank you for your purchase!", "No confirmation message is displayed");
        softAssert.assertTrue(isIdVisible, "Id is missing");
        softAssert.assertTrue(isAmountVisible, "Amount is missing");
        softAssert.assertTrue(isCardNumberVisible, "Card number is missing");
        softAssert.assertAll();
    }
}
