package geekbrains.webui.lesson_3;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class New_wishlistTest extends AbstractStart {

    private static Logger logger = LoggerFactory.getLogger(New_wishlistTest.class);

    User_loginTest user_login = new User_loginTest();

    @Test
    @DisplayName("Login")
    public void login()
    {
        logger.info("Login");
        user_login.user_login();
    }

    @Test
    @DisplayName("Create New Wish List")
    public void createNewWishList() {
        logger.info("New WISH List");
        getDriver().findElement(By.xpath("//a[@title=\"My wishlists\"]")).click();

        Assertions.assertEquals("My Store", getDriver().getTitle());

        getDriver().findElement(By.id("name")).sendKeys("NewList");
        getDriver().findElement(By.id("submitWishlist")).click();
        getDriver().findElement(By.xpath("//i[@class=\"icon-remove\"]")).click();
        getDriver().switchTo().alert().accept();

        logger.info("logout");
        getDriver().findElement(By.xpath("//a[@class=\"logout\"]")).click();
        Assertions.assertEquals("Login - My Store", getDriver().getTitle());

        getDriver().quit();
    }
}