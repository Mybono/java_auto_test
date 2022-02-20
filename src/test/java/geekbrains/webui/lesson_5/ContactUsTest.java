package geekbrains.webui.lesson_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactUsTest extends AbstractStart {

    private static Logger logger = LoggerFactory.getLogger(ContactUsTest.class);

    @Test
    @DisplayName("ContactUsTest")
    void contactUs() {
        logger.info("contactUs");
        getDriver().findElement(By.xpath("//a[@title = \"Contact us\"]")).click();
        Assertions.assertEquals("Contact us - My Store", getDriver().getTitle());
        getDriver().findElement(By.id("id_contact")).click();
        {
            WebElement dropdown = getDriver().findElement(By.id("id_contact"));
            dropdown.findElement(By.xpath("//option[. = 'Webmaster']")).click();
        }

        logger.info("Fill the form");
        getDriver().findElement(By.id("email")).sendKeys("test@test.com");
        getDriver().findElement(By.id("id_order")).sendKeys("no order");
        getDriver().findElement(By.id("message")).sendKeys("WHY???!!!");

        logger.info("Send MSG");
        getDriver().findElement(By.id("submitMessage")).click();

        Assertions.assertEquals("Your message has been successfully sent to our team.", getDriver().findElement(By.xpath("//p[@class = 'alert alert-success']")).getText());

    }
}