package geekbrains.webui.lesson_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class User_loginTest extends AbstractStart {

    private static Logger logger = LoggerFactory.getLogger(User_loginTest.class);

    @Test
    @DisplayName("Login TEST")
    void user_login() {
        logger.info("Login TEST");
        getDriver().findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
        getDriver().findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test777@test.com");
        getDriver().findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("123456");
        getDriver().findElement(By.id("SubmitLogin")).click();
        Assertions.assertEquals("My account - My Store", getDriver().getTitle());
    }
}
