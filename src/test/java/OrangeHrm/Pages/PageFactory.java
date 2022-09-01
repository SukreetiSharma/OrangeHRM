package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private LoginPage Admin;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
}
