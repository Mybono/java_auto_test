package geekbrains.webui.lesson_5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class UserLoginTest extends AbstractStart {

    @Test
    void user_login() {
    getDriver().findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
    getDriver().findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test777@test.com");
    getDriver().findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("123456");
    getDriver().findElement(By.id("SubmitLogin")).click();
    }
}
