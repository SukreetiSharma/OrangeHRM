package OrangeHrm.Test;

import org.testng.annotations.Test;

public class TestApplyLeave extends BaseClass{

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        pageFactory.getLoginPage().login();
    }
    @Test(priority = 2)
    public void Apply() throws InterruptedException{
        pageFactory.getApplyLeave().applyLeave();
    }

}
