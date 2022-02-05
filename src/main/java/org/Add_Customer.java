package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.concurrent.TimeUnit;

public class Add_Customer {

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
        driver.findElement(By.xpath(".//button[@ng-click = 'manager()']")).click();
        driver.findElement(By.xpath(".//button[@ng-click = 'addCust()']")).click();
        // вносим данные нового customer
        driver.findElement(By.xpath(".//input[@placeholder = 'First Name']")).sendKeys("Ford");
        driver.findElement(By.xpath(".//input[@placeholder = 'Last Name']")).sendKeys("Henry");
        driver.findElement(By.xpath(".//input[@placeholder = 'Post Code']")).sendKeys("987");
        driver.findElement(By.xpath(".//button[@type= \"submit\"]")).submit();
        driver.quit();
    }
}
