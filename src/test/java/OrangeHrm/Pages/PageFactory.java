package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private PimPage pimPage;
    private Adduser addUser;
    private DeleteUser deleteUser;
    private ApplyLeave applyLeave;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public PimPage getPimPage() {
        if(pimPage == null){
            pimPage = new PimPage(driver);
        }
        return pimPage;
    }

    public Adduser getAddUser() {
        if(addUser == null){
            addUser = new Adduser(driver);
        }
        return addUser;
    }
    public DeleteUser getDeleteUser() {
        if(deleteUser == null){
            deleteUser = new DeleteUser(driver);
        }
        return deleteUser;
    }
    public ApplyLeave getApplyLeave() {
        if(applyLeave == null){
            applyLeave = new ApplyLeave(driver);
        }
        return applyLeave;
    }
 }

