package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Delete_Customer {

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

        driver.findElement(By.xpath(".//button[@type= \"submit\"]")).submit(); // после появл. алерт.

        // тут я пытаюсь поймать алерт, но не очень получается...
//        Alert alert = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.alertIsPresent());
//
//        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("/create"));
//        driver.switchTo().alert().accept();


        // по плану переходим на вкладку customers, но сюда мы уже не доходим.
        driver.findElement(By.xpath(".//ng-click=\"showCust()\"]")).submit();

        // удаляем нового customer
        driver.findElement(By.xpath("./td[text()='Ford'] // following-sibling::td[text()='Henry'] // following-sibling::td[text()='987'] // following::button[text()='Delete']")).submit();
        driver.quit();
    }
}
