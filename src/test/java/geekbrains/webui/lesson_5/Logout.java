package geekbrains.webui.lesson_5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Logout extends AbstractStart {

        @Test
        @DisplayName("Logout")
        @AfterAll
        void logout()

        {
            getDriver().findElement(By.xpath("//a[@class=\"logout\"]")).click();
            getDriver().quit();
        }
}
