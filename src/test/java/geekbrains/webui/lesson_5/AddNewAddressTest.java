//package geekbrains.webui.lesson_5;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//
//
//public class AddNewAddressTest extends AbstractStart {
//
//        @Test
//        void addNewAddressTest() throws InterruptedException {
//
//                getDriver().findElement(By.xpath("//a[@title=\"Addresses\"]")).click();
//                getDriver().findElement(By.xpath("//a[@title=\"Add an address\"]")).click();
//
//        // add new address
//                getDriver().findElement(By.id("firstname")).click();
//                getDriver().findElement(By.id("lastname")).click();
//                getDriver().findElement(By.id("address1")).sendKeys("NewAddress");
//                getDriver().findElement(By.id("city")).sendKeys("NewCity");
//
//                getDriver().findElement(By.id("id_state")).click();
//                {
//                        WebElement dropdown = getDriver().findElement(By.id("id_state"));
//                        dropdown.findElement(By.xpath("//option[. = 'California']")).click();
//                }
//
//                getDriver().findElement(By.id("postcode")).sendKeys("00000");
//                getDriver().findElement(By.id("phone")).sendKeys("78787878");
//                getDriver().findElement(By.id("phone_mobile")).sendKeys("56565656");
//
//                WebElement element = driver().findElement(By.xpath("alias"));
//                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//
//                Thread.sleep(500);
//                getDriver().findElement(By.id("alias")).clear();
//                getDriver().findElement(By.id("alias")).sendKeys("NewAddress");
//
//                getDriver().findElement(By.id("submitAddress")).click();
//
//        // delete new address
//                getDriver().findElement(By.xpath("//div[@class=\"addresses\"]//div[2]//a[@title=\"Delete\"]")).click();
//                getDriver().switchTo().alert().accept();
//    }
//}
