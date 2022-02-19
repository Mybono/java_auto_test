package geekbrains.webui.lesson_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewsLetterTest extends AbstractStart {



    private static Logger logger = LoggerFactory.getLogger(NewsLetterTest.class);

    @Test
    @DisplayName("NewsLetterTest")
    void newsLetter() {
        logger.info("contactUs");

        getDriver().findElement(By.id("newsletter-input")).sendKeys("test@test.com");
        Assertions.assertEquals("Newsletter : This email address is already registered.", getDriver().getTitle());


        getDriver().findElement(By.xpath("//button[@name = \"submitNewsletter\"]")).click();

        getDriver().quit();


    }
}