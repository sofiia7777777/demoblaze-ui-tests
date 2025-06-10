# UI Automation Tests for Demoblaze Website

## Project Description

This project contains automated UI tests for the [Demoblaze](https://www.demoblaze.com/) website, written in Java using WebDriver and TestNG.


---

## Test Scenarios

### Scenario 1: Verify that an existing user can successfully log in
**Precondition:** User account with valid credentials already exists (is created manually).  
**Steps:**
1. Open the website: https://www.demoblaze.com/
2. Click on the "Log in" button in the navigation bar.
3. Enter valid username.
4. Enter valid password.
5. Click the "Log in" button in the modal.
6. Verify that the user is logged in:  
   6.1 No “Log In” button is displayed  
   6.2 The "Welcome [username]" text is visible

### Scenario 2: Verify that the user can add a product to the cart
**Steps:**
1. Open https://www.demoblaze.com/
2. Select a category "Laptops"
3. Click on a product "Sony vaio i5"
4. Click the "Add to cart" button on the product page.
5. Handle and accept the confirmation alert
6. Click on the "Cart" section in the navigation bar
7. Verify that the product appears in the cart:  
   7.1 Verify that the product name is "Sony vaio i5"  
   7.2 Verify that the product price matches the expected value

### Scenario 3: Verify product purchase
**Steps:**
1. Open https://www.demoblaze.com/
2. Select a category "Phones"
3. Click on a product "Samsung galaxy s6"
4. Click the "Add to cart" button on the product page.
5. Handle and accept the confirmation alert
6. Click on the "Cart" section in the navigation bar
7. Click on the "Place Order" button.
8. Fill in the order form with valid data(Name, Country, City, Credit card, Month, Year)
9. Click on the "Purchase" button.
10. Verify that a confirmation modal appears with a success message and purchase details.

---

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM) with inheritance levels  
- Maven