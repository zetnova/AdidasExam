package com.automation.pageObjects;

import com.automation.tools.Tools;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.automation.tools.SeleniumWebDriver.getWebDriver;

public class AdidasPO extends Tools {




    static synchronized public List<WebElement> categories() throws Exception {
        return getWebDriver().findElements(By.id("itemc"));
    }
    static synchronized public WebElement categoryPhones() throws Exception {
        return categories().get(0);
    }


    static synchronized public WebElement categoryLaptops() throws Exception {
        return categories().get(1);
    }

    static synchronized public WebElement categoryMonitors() throws Exception {
        return categories().get(2);
    }


    static synchronized public List<WebElement> productCardTitles() throws Exception {
        return getWebDriver().findElements(By.xpath("//div[@class='col-lg-4 col-md-6 mb-4']"));

    }

    public static void getAllProductsOnCategory() throws Exception {
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int i = 0; i < productCardTitles().size(); i++) {
            ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", productCardTitles().get(i));
            Thread.sleep(1000);
            String allProducts = productCardTitles().get(i).getText();
            if(!(allProducts ==null)) System.out.println(allProducts);

        }
    }

    public static void acceptAlert() {

        try {
            WebDriverWait wait = new WebDriverWait(getWebDriver(), 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = getWebDriver().switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println(e + " Something is wrong with this website ");
        }

    }

    static synchronized public WebElement sonyVaioI5() throws Exception {
        return findElementBy(By.xpath("//a[@href='prod.html?idp_=8']"));

    }

    static synchronized public WebElement dellI7() throws Exception {
        return findElementBy(By.xpath("//a[@href='prod.html?idp_=12']"));

    }

    static synchronized public WebElement addToCart() throws Exception {
        return findElementBy(By.xpath("//a[@class='btn btn-success btn-lg']"));

    }

    static synchronized public WebElement goToCart() throws Exception {
        return findElementBy(By.id("cartur"));
    }

    static synchronized public List<WebElement> productsInTheCart() throws Exception {
        return getWebDriver().findElements(By.xpath("//*[@class='success']"));
    }

    static synchronized public WebElement productForDelete() throws Exception {
        return findElementBy(By.xpath("//*[@class='success']"));

    }

    public static void deleteProductFromTheCart(String product) throws Exception {

        for (int i = 0; i < productsInTheCart().size(); i++) {
            if (productsInTheCart().get(i).getText().contains(product)) {
                WebElement forDelete = productsInTheCart().get(i);
                getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                forDelete.findElement(By.xpath("//*[@id='tbodyid']//td[4]/a")).click();
            }
        }
    }



    static synchronized public WebElement placeOrder() throws Exception {
        return findElementBy(By.xpath("/html/body/div[6]/div/div[2]/button"));
    }

    //modal-dialog

    public static void clickToOpenModal(final WebElement we) {

        Set<String> initWindowHandles =getWebDriver().getWindowHandles();
        Thread thread1 = new Thread() {

            @Override
            public void run() {
                (we).click();
            }
        };
        thread1.start();

        thread1.interrupt();
        thread1 = null;


        Iterator<String> it = getWebDriver().getWindowHandles().iterator();
        String windowHandle = "";
        while(it.hasNext()){
            windowHandle = it.next();
        }

        //Switch focus and work on the modal window
        getWebDriver().switchTo().window(windowHandle);
    }

    static synchronized public WebElement modalDialog() throws Exception {
        return findElementBy(By.xpath("//*[@id='orderModal']"));
    }

    static synchronized public WebElement addName() throws Exception {
        return findElementBy(By.id("name"));
    }

    static synchronized public WebElement addCountry() throws Exception {
        return findElementBy(By.id("country"));
    }

    static synchronized public WebElement addCity() throws Exception {
        return findElementBy(By.id("city"));
    }

    static synchronized public WebElement addCreditCard() throws Exception {
        return findElementBy(By.id("card"));
    }

    static synchronized public WebElement addMonth() throws Exception {
        return findElementBy(By.id("month"));
    }

    static synchronized public WebElement addYear() throws Exception {
        return findElementBy(By.id("year"));
    }

    static synchronized public WebElement purchase() throws Exception {
        return findElementBy(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]"));
    }

    static synchronized public WebElement totalSumInPlaceOrder() throws Exception {
        return findElementBy(By.id("totalm"));
    }

    static synchronized public WebElement secondModalDialog() throws Exception {
        return findElementBy(By.xpath("//*[@class='sweet-alert  showSweetAlert visible']"));
    }

    static synchronized public WebElement orderID() throws Exception {
        return findElementBy(By.xpath("/html/body/div[10]/p/text()[1]"));
    }

    static synchronized public WebElement amountInOrder() throws Exception {
        return findElementBy(By.xpath("/html/body/div[10]/p/text()[2]"));
    }


    static synchronized public WebElement purchaseConfirmationOK() throws Exception {
        return findElementBy(By.xpath("/html/body/div[10]/div[7]/div/button"));
    }

}

