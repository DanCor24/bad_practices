package com.company.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage{

    @FindBy(css = "div.mega-home-tm div.css-o3kd11:nth-child(2) div.container-tm.d-flex.justify-content-between.align-items-center div.only-pc.w-75:nth-child(2) div.d-flex form.css-kis91n div.react-autosuggest__container > input.react-autosuggest__input")
    private WebElement inputSearch;

    @FindBy(css = ".css-1jomwfj svg")
    private WebElement btnUser;

    @FindBy(css = ".react-autosuggest__section-container.react-autosuggest__section-container--first .react-autosuggest__section-title")
    private WebElement titleCategoria;

    @FindBy(css = ".css-18vjwih[type=\"submit\"]")
    private WebElement btnFind;

    @FindBy(css = "img[alt=\"SUMEPSERC-38B-CINTA IMPRESORA EPSON TMU-200\"]")
    private WebElement productOne;

    @FindBy(css = "#react-autowhatever-1-section-0-item-2")
    private WebElement selectSearch;

    @FindBy(css = ".btn-blank.css-cssveg")
    private WebElement btnCart;

    public void clickSearchBtn() {
        waitElements(inputSearch);
        inputSearch.click();
    }

    public HomePage(WebDriver driver, String url) {
        super(driver);
        super.driver.get(url);
    }

    public void clickFindBtn() {
        waitElements(btnFind);
        btnFind.click();
    }

    public void clickCartBtn() {
        waitElements(btnCart);
        btnCart.click();
    }

    public void sendKeysSearch() {
        inputSearch.sendKeys("celular");
        inputSearch.click();
    }

    public void selectSearch() {
        waitElements(selectSearch);
        selectSearch.click();
    }

    public void verifyCategoria() {
        waitElements(titleCategoria);
        Assert.assertEquals(titleCategoria.getText(), "Categorias");
    }
}
