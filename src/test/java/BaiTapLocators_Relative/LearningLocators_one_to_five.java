package BaiTapLocators_Relative;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearningLocators_one_to_five {

    //Xpath trang Login
    public String userName = "//input[@id='iusername']";
    public String passWord = "//input[@id='ipassword']";
    public String login = "//input[@id='ipassword']";

    //Xpath menu Projects
    public String homeMenu = "//span[normalize-space()='Home']";
    public String attendanceMenu = "//span[normalize-space()='Attendance']";
    public String projectsMenu = "//span[normalize-space()='Projects']";
    public String tasksMenu = "//span[normalize-space()='Tasks']";
    public String payrollMenu = "//span[normalize-space()='Payroll']";
    public String requestsMenu = "//a[normalize-space()='Requests']";
    public String helpdeskMenu = "//span[normalize-space()='Helpdesk']";
    public String trainingsectionsMenu = "//span[normalize-space()='Training Sessions']";

    //Xpath Add New Projects Page

    public String addnewButton = "//a[starts-with(text(),'Add New')]";
    public String title = "//input[@name='title']";
    public String client = "//span[@id='select2-client_id-container']";
    public String estimatedHour = "//input[@placeholder='Estimated Hour']";
    public String priority = "//span[@title='Highest']";
    public String startDate = "//input[@name='start_date']";
    public String endDate = "//input[@name='end_date']";
    public String summary = "//textarea[@id='summary']";
    public String team = "//ul[@class='select2-selection__rendered']";
    public String description = "//body";
    public String saveButton = "//span[normalize-space()='Save']";

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

