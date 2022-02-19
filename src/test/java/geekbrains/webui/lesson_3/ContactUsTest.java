package geekbrains.webui.lesson_3;

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

        getDriver().findElement(By.id("email")).sendKeys("test@test.com");
        getDriver().findElement(By.id("id_order")).sendKeys("no order");


//        {
//            WebElement dropdown = getDriver().findElement(By.id("id_order"));
//            dropdown.findElement(By.xpath("//option[. = 'XXOEWHPNF - 02/06/2022']")).click();
//        }
//        getDriver().findElement(By.id("id_product")).click();
//        {
//            WebElement dropdown = getDriver().findElement(By.id("id_product"));
//            dropdown.findElement(By.xpath("//option[. = 'Printed Dress - Color : Beige, Size : S']")).click();
//        }

        getDriver().findElement(By.id("message")).sendKeys("WHY???!!!");
        getDriver().findElement(By.id("submitMessage")).click();

        getDriver().quit();
    }
}