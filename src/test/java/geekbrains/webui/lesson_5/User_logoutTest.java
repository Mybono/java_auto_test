package geekbrains.webui.lesson_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class User_logoutTest extends AbstractStart {

    private static Logger logger = LoggerFactory.getLogger(User_logoutTest.class);

    @Test
    @DisplayName("Logout TEST")
    void user_logout() {

        getDriver().findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
        getDriver().findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test777@test.com");
        getDriver().findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("123456");
        getDriver().findElement(By.id("SubmitLogin")).click();
        Assertions.assertEquals("My account - My Store", getDriver().getTitle());

        logger.info("Logout TEST");
        getDriver().findElement(By.xpath("//a[@class=\"logout\"]")).click();
        Assertions.assertEquals("Login - My Store", getDriver().getTitle());

        getDriver().quit();
    }
}
