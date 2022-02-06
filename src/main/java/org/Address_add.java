package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Address_add {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments ("--no-sandbox");
        options.addArguments ("--disable-extensions");
        options.addArguments ("--incognito");
        options.addArguments ("disable-popup-blocking");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
        // login
        driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test777@test.com");
        driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("123456");
        driver.findElement(By.id("SubmitLogin")).click();

        driver.findElement(By.xpath("//a[@title=\"Addresses\"]")).click();
        driver.findElement(By.xpath("//a[@title=\"Add an address\"]")).click();

        // add new address
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("address1")).sendKeys("NewAddress");
        driver.findElement(By.id("city")).sendKeys("NewCity");

        driver.findElement(By.id("id_state")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_state"));
            dropdown.findElement(By.xpath("//option[. = 'California']")).click();
        }

        driver.findElement(By.id("postcode")).sendKeys("00000");
        driver.findElement(By.id("phone")).sendKeys("78787878");
        driver.findElement(By.id("phone_mobile")).sendKeys("56565656");

        WebElement element = driver.findElement(By.id("alias"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("NewAddress");

        driver.findElement(By.id("submitAddress")).click();

        // delete new address
        driver.findElement(By.xpath("//div[@class=\"addresses\"]//div[2]//a[@title=\"Delete\"]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();

        driver.quit();
    }
}
