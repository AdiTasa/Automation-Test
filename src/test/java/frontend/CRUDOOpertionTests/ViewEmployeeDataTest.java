package frontend.CRUDOOpertionTests;

import PageFactory.ViewEmployeeData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ViewEmployeeDataTest extends BaseTest {

    private ViewEmployeeData viewEmployee;

    @Before
    public void setup() throws InterruptedException {
        super.start();
        //Add new employee for viewing
        createEmployee();
    }

    @After
    public void quit()  {super.tearDown();}

    @Test
    public void clickViewBtn_employeeDataDisplayed()  {
        viewEmployee = new ViewEmployeeData(driver);
        viewEmployee.clickViewIcon();
        boolean result = viewEmployee.checkEmployeeData(newEmployee.NAME,newEmployee.EMAIL,newEmployee.PHONE);
        viewEmployee.BackHomePage();
        Assert.assertTrue("View employee data failed",result);



    }
}
