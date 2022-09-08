package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteUser {
    WebDriver driver;
    By Delete = By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]");
    By confirm = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");

    public DeleteUser(WebDriver driver){
        this.driver=driver;
    }

    public void deleteUser() throws InterruptedException {
        driver.findElement(Delete).click();
        driver.findElement(confirm).click();
    }
}
