package OrangeHrm.Test;

import org.testng.annotations.Test;

import static OrangeHrm.Test.BaseClass.pageFactory;
public class TestDeleteUser extends BaseClass{

@Test(priority = 1)
public void Login() throws InterruptedException{
        pageFactory.getLoginPage().login();
}

    @Test(priority = 2)
    public void DeleteUser() throws InterruptedException{
        pageFactory.getDeleteUser().deleteUser();
    }
}
