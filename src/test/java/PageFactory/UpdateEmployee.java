package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static frontend.CRUDOOpertionTests.UpdateEmployeeTest.NEW_EMAIL;
import static frontend.CRUDOOpertionTests.UpdateEmployeeTest.NEW_NAME;
import static frontend.CRUDOOpertionTests.UpdateEmployeeTest.NEW_PHONE;

public class UpdateEmployee {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"employeesTable\"]/tbody/tr/td[5]/a[2]")
    WebElement UpdateIcon;

    @FindBy(name="name")
    WebElement NameInput;

    @FindBy(name="email")
    WebElement EmailInput;

    @FindBy(name="phone")
    WebElement PhoneInput;

    @FindBy(css="[type='submit']")
    WebElement SubmitBtn;

    private CreateEmployee newEmployee;

    public UpdateEmployee(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
        newEmployee = new CreateEmployee(driver);


    }

    public void clickUpdateIcon() {

        UpdateIcon.click();
    }

    public void updateEmployeeData() {
        NameInput.clear();
        EmailInput.clear();
        PhoneInput.clear();
        newEmployee.enterData(NEW_NAME,NEW_EMAIL,NEW_PHONE);
    }

    public void clickSubmitBtn(){

        SubmitBtn.click();
    }

    public boolean checkEmployeeUpdated() {
        return newEmployee.checkEmployeeCreated(NEW_NAME, NEW_EMAIL, NEW_PHONE);
    }
}
