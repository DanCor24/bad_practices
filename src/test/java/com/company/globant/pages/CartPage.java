package com.company.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage{

    @FindBy(css = ".titl-cart.position-relative .text-center")
    private WebElement titleCart;

    public void verifyCart() {
        waitElements(titleCart);
        Assert.assertEquals(titleCart.getText(), "Mi carrito");
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
