package pom;

import org.openqa.selenium.By;

public class homepage {
public  By account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
public By login = By.xpath("//div[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
public By email = By.xpath("//input[@id=\"input-email\"]");
public By password =By.xpath("//input[@id=\"input-password\"]");
public By submit = By.xpath("//input[@type=\"submit\"]");
public By home = By.xpath("//div[@id=\"account-account\"]/ul/li[1]");
public By menu= By.xpath("//div[@class=\"collapse navbar-collapse navbar-ex1-collapse\"]/ul/li[6]");
public By select =By.xpath("//select[@id=\"input-sort\"]");
public By prod =By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
public By clear =By.xpath("//input[@id=\"input-quantity\"]");
public By button=By.xpath("//button[@id=\"button-cart\"]");
public By text=By.xpath("//div[@id=\"product-product\"]/div[1]");
public By cart =By.xpath("//div[@id=\"cart\"]/button");
public By view1= By.xpath("//div[@id=\"content\"]/form/div/table/tbody/tr/td/a/img");
public By view2= By.xpath("//div[@id=\"content\"]/form/div/table/tbody/tr/td[2]");
public By view3= By.xpath("//div[@id=\"content\"]/form/div/table/tbody/tr/td[3]");
public By view4= By.xpath("//div[@id=\"content\"]/form/div/table/tbody/tr/td[4]");
public By view5= By.xpath("//div[@id=\"content\"]/form/div/table/tbody/tr/td[5]");
public By view6= By.xpath("//div[@id=\"content\"]/form/div/table/tbody/tr/td[6]");
public By close =By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button");
public By logout =By.xpath("//div[@id=\"top-links\"]/ul/li/ul/li[5]");


}
