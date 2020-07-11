package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewEmployeeData {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"employeesTable\"]/tbody/tr/td[5]/a[1]")
    WebElement ViewIcon;

    @FindBy(id = "backBtn")
    WebElement BackBtn;

    @FindBy(id="name")
    WebElement Name;

    @FindBy(id="email")
    WebElement Email;

    @FindBy(id="phone")
    WebElement Phone;


    public ViewEmployeeData(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void clickViewIcon() {

        ViewIcon.click();
    }

    public boolean checkEmployeeData(String name, String email, String phone) {
        if(Name.getText().equals(name) && Email.getText().equals(email) && Phone.getText().equals(phone) )
        {
            return true;
        }
        return false;

    }

    public void BackHomePage() {

        BackBtn.click();
    }

}
