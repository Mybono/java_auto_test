package org;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Add_2_cart {

    public static void main(String[] args) {
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
        driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]")).click();
        driver.findElement(By.xpath("//a[@title=\"Home\"]")).click();

        driver.findElement(By.xpath("//a[@title=\"Women\"]")).click();
        driver.findElement(By.xpath("//a[@title=\"All specials\"]")).click();
        driver.findElement(By.xpath("//ul[@class=\"product_list grid row\"]/li[1]")).click();

        // add to cart
        driver.findElement(By.xpath("//button[@class=\"exclusive\"]")).click();

//        попытка навести курсор мыши на элемент
//        FirefoxDriver driver2 = new FirefoxDriver();
//        WebElement element = driver2.findElement(By.xpath("//ul[@class=\"product_list grid row homefeatured tab-pane active\"]/li[4]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).build().perform();

//        driver.findElement(By.xpath("//a[@data-id-product=\"4\"]")).click();

//        driver.findElement(By.xpath("//span[@title=\"Continue shopping\"]")).click();
//
//        driver.findElement(By.xpath("//a[@data-id-product=\"6\"]")).click();
//        driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]")).click();
//        driver.findElement(By.xpath("//p//a[@title=\"Proceed to checkout\"]")).click();
//        driver.findElement(By.xpath("//button[@name=\"processAddress\"]")).click();
//        driver.findElement(By.xpath("//input[@id=\"cgv\"]")).click();
//        driver.findElement(By.xpath("//button[@name=\"processCarrier\"]")).click();
//        driver.findElement(By.xpath("//a[@title=\"Pay by bank wire\"]")).click();
//        driver.findElement(By.xpath("//p//button[@type=\"submit\"]")).click();
//        driver.findElement(By.xpath("//a[@title=\"Sign out\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();
        driver.quit();
    }
}
