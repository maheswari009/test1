package logic;

import help.seleniumhelper2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.homepage;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.stream.Stream;

public class tester extends seleniumhelper2 {




    public static void main(String[] args) throws Exception {

        tester testcase = new tester();
        homepage pageH = new homepage();




        WebDriver driver = testcase.launchChrome();
        testcase.LaunchURL(driver, "https://demo.opencart.com/");
         //FileReader reader = new FileReader("data.properties");
        //Properties dataProp = new Properties();
        //dataProp.load(reader);
        //String url= dataProp.getProperty("url");
        System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();

        testcase.Myaccount(driver, pageH.account);
        testcase.login(driver, pageH.login);
        testcase.entertext(driver, pageH.email, pageH.password);
        testcase.takeScreenShot(driver,"mywindow");
        testcase.submit(driver, pageH.submit);
        testcase.click(driver, pageH.menu);
        testcase.sort(driver, pageH.select);
        testcase.product(driver, pageH.prod);
        testcase.clear(driver,pageH.clear);
        testcase.button(driver,pageH.button);
        testcase.cartButton(driver,pageH.cart);
        testcase.checkItems(driver,pageH.view1);
        testcase.checkItems(driver,pageH.view2);
        testcase.checkItems(driver,pageH.view3);
        testcase.checkItems(driver,pageH.view4);
        testcase.checkItems(driver,pageH.view5);
        testcase.checkItems(driver,pageH.view6);
        testcase.closecart(driver,pageH.close);
        testcase.logout(driver,pageH.logout);




    }



}
