package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class User_login {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments ("start-maximized");
        options.addArguments ("--no-sandbox");
        options.addArguments ("--disable-extensions");
        options.addArguments ("--incognito");
        options.addArguments ("disable-popup-blocking");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.findElement(By.xpath(".//button[@ng-click='customer()']")).click();
        driver.findElement(By.id("userSelect")).click();
        {
            WebElement dropdown = driver.findElement(By.id("userSelect"));
            dropdown.findElement(By.xpath("//option[. = 'Neville Longbottom']")).click();
        }
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        driver.quit();
    }
}
