package com.company.globant.tests;

import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(AllureTestNg.class)
public class Make_find_test extends BaseTest{
    //Execute the test with a before method
    @Test
    public void test1() {
        homePage.clickSearchBtn();
        homePage.sendKeysSearch();
        homePage.verifyCategoria();
        homePage.selectSearch();
    }
    //Execute the test with a before method again
    @Test
    public void test2() {
        homePage.clickSearchBtn();
        homePage.sendKeysSearch();
        homePage.clickFindBtn();
    }
}
