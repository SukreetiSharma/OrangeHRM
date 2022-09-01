package OrangeHrm.Test;

import static OrangeHrm.Test.BaseClass.setup;

public class TestLogin extends BaseClass {
    public static void main(String args[]) throws InterruptedException{
        setup();
        pageFactory.getLoginPage().login();
        pageFactory.getLoginPage().admin();
        pageFactory.getLoginPage().addUser();

    }

}
