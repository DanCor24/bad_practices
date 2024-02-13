package com.company.globant.tests;

import com.company.globant.pages.CartPage;
import com.company.globant.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    public HomePage homePage;
    private WebDriver driver = new ChromeDriver();
    public CartPage cartPage = new CartPage(driver);
    String url = "https://tecnomegastore.ec/";

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage(getDriver(),url);
    }
    public WebDriver getDriver() {
        return driver;
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
