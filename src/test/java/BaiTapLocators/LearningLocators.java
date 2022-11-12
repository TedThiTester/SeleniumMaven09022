package BaiTapLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearningLocators {

    //Xpath trang Login
    public String userName = "/html/body/div[1]/div/div/div/div[2]/div/form/div[1]/div[1]/input";
    public String passWord = "/html/body/div[1]/div/div/div/div[2]/div/form/div[1]/div[2]/input";
    public String login = "/html/body/div[1]/div/div/div/div[2]/div/form/div[3]/div[1]/button/span[1]";

    //Xpath menu Projects
    public String homeMenu = "/html/body/nav/div/div/ul/li[2]/a/span[2]";
    public String attendanceMenu = "/html/body/nav/div/div/ul/li[4]/a/span[2]";
    public String projectsMenu = "/html/body/nav/div/div/ul/li[4]/a/span[2]";
    public String tasksMenu = "/html/body/nav/div/div/ul/li[5]/a/span[2]";
    public String payrollMenu = "/html/body/nav/div/div/ul/li[6]/a/span[2]";
    public String requestsMenu = "/html/body/nav/div/div/ul/li[7]/a";
    public String helpdeskMenu = "/html/body/nav/div/div/ul/li[8]/a/span[2]";
    public String trainingsectionsMenu = "/html/body/nav/div/div/ul/li[9]/a/span[2]";

    //Xpath Add New Projects Page

    public String addnewButton = "/html/body/div[2]/div/div[4]/div/div[2]/div[1]/div/a[2]";
    public String title = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[1]/div/input";
    public String client = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[2]/div/span/span[1]/span/span[1]/span";
    public String estimatedHour = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[3]/div/div/input";
    public String priority = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[4]/div/span/span[1]/span/span[1]";
    public String startDate = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[5]/div/div/input";
    public String endDate = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[6]/div/div/input";
    public String summary = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[7]/div/textarea";
    public String team = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[6]/div/div/input";
    public String description = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[7]/div/textarea";
    public String saveButton = "/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[8]/div/span/span[1]/span/ul";

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Lưu xpath theo tên UI vào biến String

    }
}
