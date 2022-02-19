package geekbrains.webui.lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class AbstractStart {
    private static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-extensions");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("http://automationpractice.com/index.php"),
                "Страница не доступна");
    }

//    @AfterAll
//    static void close()
//    {
//        driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();
//        driver.quit();
//    }

    public static WebDriver getDriver() {
        return driver;
    }
}