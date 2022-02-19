package geekbrains.webui.lesson_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderDetailsTest extends AbstractStart {

    private static Logger logger = LoggerFactory.getLogger(New_wishlistTest.class);

    User_loginTest user_login = new User_loginTest();

    @Test
    @DisplayName("Login")
    public void login()
    {
        user_login.user_login();
    }

    @Test
    @DisplayName("OrderDetailsTest")
    public void OrderDetailsTest() {
        logger.info("Order Details Test");
        getDriver().findElement(By.xpath("//a[@title = 'Orders']")).click();
        Assertions.assertEquals("Order history - My Store", getDriver().getTitle());

        getDriver().findElement(By.xpath("//td[@class = \"history_detail footable-last-column\"]/a[1]")).click();
        getDriver().findElement(By.xpath("//td[@class = \"history_detail footable-last-column\"]/a[2]")).click();

        logger.info("logout");
        getDriver().findElement(By.xpath("//a[@class=\"logout\"]")).click();
        Assertions.assertEquals("Order - My Store", getDriver().getTitle());

        getDriver().quit();
    }
}

