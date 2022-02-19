package geekbrains.webui.lesson_5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class New_wishlistTest extends AbstractStart {

    UserLoginTest user_login = new UserLoginTest();
    Logout logout = new Logout();

    @Test
    @Order(1)
    @DisplayName("Login")
    public void login(){
        user_login.user_login();
    }

    @Test
    @Order(2)
    @DisplayName("Create New Wish List")
    public void createNewWishList(){
        getDriver().findElement(By.xpath("//a[@title=\"My wishlists\"]")).click();
        getDriver().findElement(By.id("name")).sendKeys("NewList");
        getDriver().findElement(By.id("submitWishlist")).click();
        getDriver().findElement(By.xpath("//i[@class=\"icon-remove\"]")).click();
        getDriver().switchTo().alert().accept();
    }

    @Test
    @Order(3)
    @DisplayName("Logout")
    @AfterAll
    public void user_logout() {
        logout.logout();
    }
}