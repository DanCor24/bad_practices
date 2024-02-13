package com.company.globant.tests;

import org.testng.annotations.Test;

public class ChangePageTest extends BaseTest{
    @Test
    public void changePage() {
        homePage.clickCartBtn();
        cartPage.verifyCart();
    }
}
