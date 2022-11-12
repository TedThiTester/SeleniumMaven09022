package BaiTapWedElementDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaiTapWedElement {

    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login HRSALE
        driver.get("https://app.hrsale.com/");

        // Bắt WedElement Login
        WebElement inputUser = driver.findElement(By.id("iusername"));
        inputUser.sendKeys("joe.larson");

        WebElement inputPassword = driver.findElement(By.id("ipassword"));
        inputPassword.sendKeys("joe.larson");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//span[@class='ladda-label']"));
        loginButton.click();
        Thread.sleep(4000);

        // Into Add new project
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='card-header-right']/a[2]")).click();
        Thread.sleep(2000);

        // Fill information project
        WebElement inputTitle = driver.findElement(By.name("title"));
        inputTitle.sendKeys("New Project");

        WebElement dropdownClient1 = driver.findElement(By.xpath("//span[@class='selection']/span/span[1]"));
        dropdownClient1.click();

        WebElement dropdownClient2 = driver.findElement(By.xpath("//li[normalize-space()='Cedric Kelly']"));
        dropdownClient2.click();

        WebElement inputHours = driver.findElement(By.xpath("//input[@placeholder='Estimated Hour']"));
        inputHours.sendKeys("4");

        WebElement dropdownPriority1 = driver.findElement(By.xpath("//span[starts-with(@id,'select2-priority')]"));
        dropdownPriority1.click();
        Thread.sleep(2000);

        WebElement dropdownPriority2 = driver.findElement(By.xpath("//li[starts-with(@id,'select2-priority')]"));
        dropdownPriority2.click();

        WebElement startDate1 = driver.findElement(By.xpath("//input[@placeholder='Start Date']"));
        startDate1.click();

        WebElement startDate3 = driver.findElement(By.xpath("//div[@class='dtp animated fadeIn']//following-sibling::button[3]"));
        startDate3.click();

        WebElement endDate1 = driver.findElement(By.xpath("//input[@placeholder='End Date']"));
        endDate1.click();

        WebElement endDate2 = driver.findElement(By.xpath("//div[@class='dtp animated fadeIn']//following-sibling::button[3]"));
        endDate2.click();

        WebElement inputSummary = driver.findElement(By.xpath("//textarea[@id='summary']"));
        inputSummary.sendKeys("New Project");

        WebElement dropdownTeam1 = driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']"));
        dropdownTeam1.click();

        WebElement dropdownTeam2 = driver.findElement(By.xpath("//li[normalize-space()='Joe Larson']"));
        dropdownTeam2.click();

        WebElement inputDescription = driver.findElement(By.xpath("//html"));
        inputDescription.sendKeys("New Project");
        Thread.sleep(4000);

        WebElement saveButton = driver.findElement(By.xpath("//div[@class='card-footer text-right']/button[1]"));
        saveButton.click();

        Thread.sleep(4000);




        //Tắt Browser HRSALE
        driver.quit();

    }
}
