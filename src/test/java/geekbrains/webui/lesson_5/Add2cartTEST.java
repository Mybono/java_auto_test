//package geekbrains.webui.lesson_5;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Add2cartTEST extends AbstractStart {
//
//    UserLoginTest user_login = new UserLoginTest();
//
//    @Test
//    @DisplayName("Login")
//    @Order(1)
//    public void login(){
//        user_login.user_login();
//    }
//
//    @Test
//    @DisplayName("add to card")
//    @Order(2)
//    void add2Cart() {
//        getDriver().findElement(By.xpath("//a[@title=\"Women\"]")).click();
//        getDriver().findElement(By.xpath("//a[@title=\"All specials\"]")).click();
//        getDriver().findElement(By.xpath("//ul[@class=\"product_list grid row\"]/li[1]")).click();
//        getDriver().findElement(By.xpath("//button[@class=\"exclusive\"]")).click();
//    }
//}
//
////package geekbrains.webui.lesson_3;
////        import io.github.bonigarcia.wdm.WebDriverManager;
////        import org.openqa.selenium.By;
////        import org.openqa.selenium.WebDriver;
////        import org.openqa.selenium.firefox.FirefoxDriver;
////        import org.openqa.selenium.firefox.FirefoxOptions;
////        import java.util.concurrent.TimeUnit;
////
////public class Add_2_cart {
////
////    public void main(String[] args) {
////        launchBrowser();
////        login();
////        steps();
////        exit();
////    }
////    public WebDriver driver;
////    public void launchBrowser() {
////
////        WebDriverManager.firefoxdriver().setup();
////        FirefoxOptions options = new FirefoxOptions();
////
////        options.addArguments ("--no-sandbox");
////        options.addArguments ("--disable-extensions");
////        options.addArguments ("--incognito");
////        options.addArguments ("disable-popup-blocking");
////
////        WebDriver driver = new FirefoxDriver(options);
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////        driver.manage().window().maximize();
////
////        driver.get("http://automationpractice.com/index.php");
////    }
////    public void login () {
////        driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
////        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test777@test.com");
////        driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("123456");
////        driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]")).click();
////        driver.findElement(By.xpath("//a[@title=\"Home\"]")).click();
////    }
////    public void steps () {
////        driver.findElement(By.xpath("//a[@title=\"Women\"]")).click();
////        driver.findElement(By.xpath("//a[@title=\"All specials\"]")).click();
////        driver.findElement(By.xpath("//ul[@class=\"product_list grid row\"]/li[1]")).click();
////        // add to cart
////        driver.findElement(By.xpath("//button[@class=\"exclusive\"]")).click();
////    }
////    public void exit () {
////        driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();
////        driver.quit();
////    }
////
////}
