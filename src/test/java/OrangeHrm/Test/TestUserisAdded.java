package OrangeHrm.Test;

import org.testng.annotations.Test;

public class TestUserisAdded extends BaseClass {

    @Test(priority = 1)
    public void Login() throws InterruptedException{
        pageFactory.getLoginPage().login();
    }

    @Test(priority = 2)
    public void AdminMenuClick() throws InterruptedException{
        pageFactory.getPimPage().Clickadmin();
    }

    @Test(priority = 3)
    public void AddUser() throws InterruptedException{
        pageFactory.getAddUser().userDetails();
        pageFactory.getAddUser().verifyUserIsAdded();
    }
}