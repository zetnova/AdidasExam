package com.automation.steps;

import com.automation.tools.BrowserType;
import com.automation.tools.Tools;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static com.automation.pageObjects.AdidasPO.*;
import static com.automation.tools.SeleniumWebDriver.getWebDriver;

public class AdidasUISteps extends Tools {

    private String totalAmount;
    private String IdAndAmount;
    private String totalAmountTobeConfirmed;

    @Given("^open demoblaze.com$")
    public void openDemoblazeCom() {
        buildDriver(BrowserType.CHROME);
    }

    @When("^Customer navigate to phone category$")
    public void navigateToSections() throws Exception {
        categories().get(0).click();

    }

    @Then("^check products in Phone category are shown$")
    public void checkProducts() throws Exception {
        getAllProductsOnCategory();
    }

    @And("^navigate to Laptops category$")
    public void navigateToLaptopSections() throws Exception {
        categories().get(1).click();
    }

    @And("^check products in Laptops category are shown$")
            public void checkProductsLaptop() throws Exception {
            getAllProductsOnCategory();
    }

    @And("^navigate to Monitors category$")
    public void navigateToMonitorSections() throws Exception {
        categories().get(2).click();
    }
    @And("^check products in Monitors category are shown$")
    public void checkProductsMonitors() throws Exception {
        getAllProductsOnCategory();
    }

    @And("^Close demoblaza.com$")
    public void close() {
        destroyDriver();
    }

    @When("^Navigate to Laptop → Sony vaio i5 and click on Add to cart. Accept pop up confirmation$")
    public void choseLaptopSonyI5() throws Exception {
        categoryLaptops().click();
        sonyVaioI5().click();
        addToCart().click();
        acceptAlert();
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.history.go(-1)");

    }

    @And("^Navigate to Laptop → Dell i7 8gb and click on Add to cart. Accept pop up confirmation$")
    public void choseLaptopDellI7() throws Exception {

        getWebDriver().navigate().back();
        categoryLaptops().click();
        dellI7().click();
        addToCart().click();
        acceptAlert();

    }

    @And("^Navigate to Cart → Delete Dell i7 8gb from cart$")
    public void deleteFromTheCart() throws Exception {
        goToCart().click();
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        deleteProductFromTheCart("Dell i7 8gb");
        Thread.sleep(1000);

    }

    @And("^Click on Place order$")
    public void clickOnPlaceOrders() throws Exception {

        placeOrder().click();
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickToOpenModal(modalDialog());

    }

    @And("^Fill in all web form fields$")
    public void addNameInTheForm() throws Exception {

        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        addName().sendKeys("Ignacio Eduardo Haza");
        addCountry().sendKeys("Spain");
        addCity().sendKeys("Madrid");
        addCreditCard().sendKeys("4539842412552967");
        addMonth().sendKeys("05");
        addYear().sendKeys("2022");

        String str = totalSumInPlaceOrder().getText();
        if (str.contains(" ")) {
            int pos = str.indexOf(" ") + 1;
            char[] chars = str.toCharArray();
            chars[pos - 1] = 'a';
            str = String.valueOf(chars);
            str += " ";
            int pos1 = str.indexOf(" ", pos);
            totalAmount = str.substring(pos, pos1);
            System.out.println(totalAmount);
        }

    }

    @And("^Click on Purchase$")
    public void clickOnPurchaseButton() throws Exception {
        purchase().click();
    }

    @And("^Capture and log purchase Id and Amount$")
    public void captureIdAndAmount() throws Exception {
        secondModalDialog().click();

        String str1= secondModalDialog().getText();
        String [] purchaseConfirmationText=str1.split(" ");
        for(int i=0;i<purchaseConfirmationText.length;i++){
            System.out.println(purchaseConfirmationText[i]);
        }

         IdAndAmount=purchaseConfirmationText[5];
         totalAmountTobeConfirmed=purchaseConfirmationText[6];

       System.out.println("The ID is " + IdAndAmount + "  is :" + totalAmountTobeConfirmed);
    }

    @Then("^Assert purchase amount equals expected$")
        public void assertPurchase () throws Exception {
        Assert.assertEquals(totalAmount, totalAmountTobeConfirmed);
    }

    @And("click on OK")
    public void clickOK() throws Exception {
        purchaseConfirmationOK().click();


    }
}
