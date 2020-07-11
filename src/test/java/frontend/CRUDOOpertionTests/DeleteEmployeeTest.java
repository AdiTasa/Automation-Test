package frontend.CRUDOOpertionTests;

import PageFactory.DeleteEmployee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeleteEmployeeTest extends BaseTest {
    private DeleteEmployee deleteEmployee;

    @Before
    public void setup() throws InterruptedException {
        super.start();
        //Add new employee for deleting
        createEmployee();
    }

    @After
    public void quit() throws Exception {super.tearDown();}

    @Test
    public void clickDeleteBtn_employeeDeleted() {
        deleteEmployee = new DeleteEmployee(driver);
        deleteEmployee.deleteEmployee();
        Assert.assertTrue("Data is not deleted",deleteEmployee.checkTableEmpty());
    }
}
