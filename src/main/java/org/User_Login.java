package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.concurrent.TimeUnit;

public class User_Login {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments ("--disable-extensions");
        options.addArguments ("--incognito");
        options.addArguments ("disable-popup-blocking");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test777@test.com");
        driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("123456");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();

        driver.quit();

    }
}
