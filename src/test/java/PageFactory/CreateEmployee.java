package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import static frontend.CRUDOOpertionTests.CreateEmployeeTest.EMAIL;
import static frontend.CRUDOOpertionTests.CreateEmployeeTest.NAME;
import static frontend.CRUDOOpertionTests.CreateEmployeeTest.PHONE;

public class CreateEmployee {

    WebDriver driver;

    @FindBy(id="newEmpBtn")

    WebElement newEmployeeBtn;

    @FindBy(name="name")
    WebElement NameInput;

    @FindBy(name="email")
    WebElement EmailInput;

    @FindBy(name="phone")
    WebElement PhoneInput;

    @FindBy(id="submit")

    WebElement SubmitBtn;

    @FindBy(xpath="(//table[1]/tbody/tr)[last()]")

    WebElement LastRow;

    public CreateEmployee(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }


    public void clickNewEmployeeBtn(){

        newEmployeeBtn.click();

    }

    public void enterData(String name, String email, String phone) {

        NameInput.sendKeys(name);
        EmailInput.sendKeys(email);
        PhoneInput.sendKeys(phone);

    }

    public void clickSubmitBtn(){

        SubmitBtn.click();

    }

    public boolean checkEmployeeCreated(){
        return checkEmployeeCreated(NAME,EMAIL,PHONE);
    }

    public boolean checkEmployeeCreated(String name,String email, String phone) {

        if(LastRow.getText().contains(name+" "+email+" "+phone))
            return true;
        return false;

    }

    }
