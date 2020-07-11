package frontend.CRUDOOpertionTests;

import PageFactory.UpdateEmployee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UpdateEmployeeTest extends BaseTest {
    public static final String NEW_NAME ="Joes";
    public static final String NEW_EMAIL ="Joes@mail.com";
    public static final String NEW_PHONE ="77777777";
    private UpdateEmployee updateEmployee;


    @Before
    public void setup() throws InterruptedException {
        super.start();
        //Add new employee for updating
        createEmployee();
    }

    @After
    public void quit() throws Exception {super.tearDown();}

    @Test
    public void clickUpdateBtn_enterValidData_employeeDataUpdated()  {
        updateEmployee = new UpdateEmployee(driver);
        updateEmployee.clickUpdateIcon();
        updateEmployee.updateEmployeeData();
        updateEmployee.clickSubmitBtn();
        Assert.assertTrue("Employee is not updated",updateEmployee.checkEmployeeUpdated());


    }
}
