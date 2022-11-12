package BaiTapWedElementDriver;

import common.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaiTapWedDriver extends BaseTest {
    public static void main(String[] args) {

        createBrowser();

        //Login HRSALE
        driver.get("https://app.hrsale.com/");

        closerDriver();
    }
}
