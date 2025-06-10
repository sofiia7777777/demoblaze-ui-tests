package com.demoblaze.tests;

import com.demoblaze.components.HeaderComponent;
import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTests extends BaseTest{

    @Test
    public void verifyUserCanAddProductToCart(){
        SoftAssert softAssert = new SoftAssert();
        homePage.selectCategory("Laptops");
        ProductPage productPage = homePage.selectProduct("Sony vaio i5");
        productPage.addToCart();
        productPage.handleAlert();
        HeaderComponent header = homePage.getHeaderComponent();
        CartPage cartPage = header.clickCart();
        String productTitle = cartPage.getProductTitle();
        String productPrice = cartPage.getProductPrice();

        softAssert.assertEquals(productTitle, "Sony vaio i5", "The Product Title is incorrect");
        softAssert.assertEquals(productPrice, "790", "The Product Price is incorrect");
        softAssert.assertAll();
    }
}
