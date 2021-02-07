package help;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class seleniumhelper2 {
    // launching the Chrome
    public WebDriver launchChrome() {


        WebDriver driver = new ChromeDriver();
        return driver;
    }
    //launching the url
    public void LaunchURL(WebDriver driver, String url) {
        driver.get(url);
        System.out.println("Launching the url");
    }

    //clicking the account
    public void Myaccount(WebDriver driver, By element) {
       waitForClick(driver, element);
        driver.findElement(element).click();
        System.out.println("Account clicked");
    }
    //clicking the login
    public void login(WebDriver driver, By element) {
        waitForClick(driver, element);
        driver.findElement(element).click();
        System.out.println("logged");
    }
    //enter the email and password
    public void entertext(WebDriver driver, By element, By element1) {
        waitForClick(driver, element);
        driver.findElement(element).sendKeys("uvxyz@gmail.com");
        System.out.println("Email is uvxyz@gmail.com");
        driver.findElement(element1).sendKeys("1234567");
        System.out.println("Password is 1234567");
    }//clicking the login button
    public void submit(WebDriver driver, By element) {
        waitForClick(driver, element);
        driver.findElement(element).click();
        System.out.println("login clicked");
            }//taking screenshot
            public void takeScreenShot(WebDriver driver,String filename) throws IOException{
        File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler .copy(screenshot,new File(filename+" filename.png"));
    }
    //clicking the menu item
    public void click(WebDriver driver, By element) {
        waitForClick(driver, element);

        driver.findElement(element).click();
        System.out.println("menu item is clicked");
    }
    //sorting the items
    public void sort(WebDriver driver, By element) {
        waitForClick(driver, element);
        WebElement el = driver.findElement(element);
        Select sel = new Select(el);
        sel.selectByIndex(3);
        System.out.println("producted is selected");
    }
    //selecting the product
    public void product(WebDriver driver, By element) {
        waitForClick(driver, element);
        driver.findElement(element).click();
//checking the url and price
        String actualURL = browserURL(driver);
        String exceptedURL = "https://demo.opencart.com/index.php?route=product/product&path=24&product_id=28&sort=p.price&order=ASC";
        if (exceptedURL.equals((actualURL)))
            System.out.println("URL is matched");
        String headerexceptedValue = "HTC Touch HD";
        String actualheaderValue = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/h1")).getText();
        if (headerexceptedValue.equals(actualheaderValue))
            System.out.println(headerexceptedValue + "is matched");
        String actualPrice = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")).getText();
        String exceptedPrice = "$100.00";
        if (exceptedPrice.equals(actualPrice))
            System.out.println(actualPrice + "is matched");
    }
//clear the quantity box
    public void clear(WebDriver driver, By element) {
        waitForClick(driver, element);
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys("2");
    }
//add the items to cart
    public void button(WebDriver driver, By element) {
        waitForClick(driver, element);
        driver.findElement(element).click();
    }
//clicking the cartbutton
    public void cartButton(WebDriver driver, By element) {
        waitForClick(driver, element);

        driver.findElement(element).click();
        System.out.println("viewing the cart");

        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();


    }
//checking the image,product,price.tolpriceand quantity
    public void checkItems(WebDriver driver, By element) {
        waitForClick(driver, element);
        driver.findElement(element).getText();
        System.out.println("Image is displayed");
        driver.findElement(element).getText();
        System.out.println("Product  name is displayed");
        driver.findElement(element).getText();
        System.out.println(" Model is displayed");
        driver.findElement(element).getText();
        System.out.println("Quantity is displayed");
        driver.findElement(element).getText();
        System.out.println("Price is displayed");
        driver.findElement(element).getText();
        System.out.println("TotalPrice is displayed");
    }
//clearing the cartitems
    public void closecart(WebDriver driver, By element) {
        waitForClick(driver, element);

         driver.findElement(By.xpath("//div[@id=\"cart\"]/button")).click();
        Actions act = new Actions(driver);
        WebElement close = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button"));
        act.moveToElement(close).click().build().perform();
        System.out.println("the cart is empty");
    }
    //logout
    public void logout(WebDriver driver,By element)
    { waitForClick(driver, element);
        Actions act = new Actions(driver);
        WebElement account = driver.findElement(By.xpath("//div[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
        act.moveToElement(account).click().build().perform();
        driver.findElement(By.xpath("//div[@id=\"top-links\"]/ul/li/ul/li[5]")).click();
        System.out.println("logged out");
        driver.quit();
    } //verify text
    public boolean verifyText(String actualText,String ExpectedText)
    {
        if(actualText.equalsIgnoreCase(ExpectedText))
        {
            return true;
                   } else
        {
            throw new AssertionError(actualText+" not matching "+ ExpectedText);
        }
    }
    //wait for element
    public void waitForClick(WebDriver driver,By element) {


        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
//returing the browser
    private String browserURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    }
