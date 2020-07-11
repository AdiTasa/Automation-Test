package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;
//import java.util.List;

public class DeleteEmployee {


    WebDriver driver;

    @FindBy(css = "[type='submit'")
    WebElement SubmitBtn;

    @FindBy(xpath = "//*[@id=\"employeesTable\"]/tbody/tr/td[5]/a[3]")
    WebElement DeleteIcon;



    public DeleteEmployee(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void deleteEmployee() {

        DeleteIcon.click();
        SubmitBtn.click();

        }

    public boolean checkTableEmpty() {

        Boolean isPresent = driver.findElements(By.id("emptyTable")).size() > 0;
        return isPresent;


    }
}


