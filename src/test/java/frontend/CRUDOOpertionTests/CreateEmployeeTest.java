package frontend.CRUDOOpertionTests;

import PageFactory.CreateEmployee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CreateEmployeeTest extends BaseTest {

    public static final String NAME ="Joe";
    public static final String EMAIL ="Joe@mail.com";
    public static final String PHONE ="5555555555";
    private CreateEmployee objNewEmployee;



    @Before
    public void setup() {super.start();}

    @After
    public void quit()  {super.tearDown();}

    @Test
    public void clickNewBtn_entersValidData_employeeCreated() throws InterruptedException {

        objNewEmployee = new CreateEmployee(driver);
        objNewEmployee.clickNewEmployeeBtn();
        objNewEmployee.enterData(NAME,EMAIL,PHONE);
        objNewEmployee.clickSubmitBtn();
        Assert.assertTrue("Employee is not created",objNewEmployee.checkEmployeeCreated());

    }




}
