package frontend.CRUDOOpertionTests;

import PageFactory.DeleteEmployee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BaseTest {

    public static String testUrl = "http://localhost/HomeWork/index.php";
    public static WebDriver driver;
    public static DeleteEmployee deleteEmployee;
    public static CreateEmployeeTest newEmployee;



    public static void start() {
        System.setProperty(
                    "webdriver.chrome.driver",
                    "webdriver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testUrl);
        clearTableData();
    }

    public void createEmployee() throws InterruptedException {
        newEmployee = new CreateEmployeeTest();
        newEmployee.clickNewBtn_entersValidData_employeeCreated();
    }

    public static void clearTableData() {
        deleteEmployee = new DeleteEmployee(driver);
        int attempt = 0;
        while (!deleteEmployee.checkTableEmpty()) {
            deleteEmployee.deleteEmployee();
            attempt++;
            if (attempt > 3) {
                System.err.println("Can not clear table data");
                return;
            }
        }
    }


    public static void tearDown() {
        clearTableData();
        driver.quit();
    }




    }










