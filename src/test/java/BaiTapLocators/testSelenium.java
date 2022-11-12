package BaiTapLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testSelenium {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // THEO ID

        //Mở trang eCommerce
//        driver.get("https://demo.activeitzone.com/ecommerce/login");
//        Thread.sleep(1000);
//
//        //Điền Email
//        driver.findElement(By.id("email")).sendKeys("admin@example.com");
//        Thread.sleep(2000);
//
//        //Điền password
//        driver.findElement(By.id("password")).sendKeys("123456");
//        Thread.sleep(2000);
//
//        //Linktext
////        driver.findElement(By.linkText("Forgot password ?")).click();
//
//        //Tắt browser
//        driver.quit();

        // THEO NAME

        //Mở trang eCommerce
//        driver.get("https://demo.activeitzone.com/ecommerce/login");
//        Thread.sleep(1000);
//
//        //Điền Email
//        driver.findElement(By.name("email")).sendKeys("admin@example.com");
//        Thread.sleep(2000);
//
//        //Điền password
//        driver.findElement(By.name("password")).sendKeys("123456");
//        Thread.sleep(2000);
//
//        //Linktext
////        driver.findElement(By.linkText("Forgot password ?")).click();
//
//        //Tắt browser
//        driver.quit();

        // Theo linkText

        //Mở trang eCommerce
//        driver.get("https://demo.activeitzone.com/ecommerce/login");
//        Thread.sleep(1000);
//
//        //Điền Email
//        driver.findElement(By.id("email")).sendKeys("admin@example.com");
//        Thread.sleep(2000);
//
//        //Điền password
////        driver.findElement(By.id("password")).sendKeys("123456");
////        Thread.sleep(2000);
//
//        //Linktext
////        driver.findElement(By.linkText("Forgot password ?")).click();
//
//        //Tắt browser
//        driver.quit();

        //


    }

}
