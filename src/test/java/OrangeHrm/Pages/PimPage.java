package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PimPage {
    WebDriver driver;
    By admin = By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]");
    By Add = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    public PimPage(WebDriver driver){

        this.driver=driver;
    }
    public void Clickadmin() throws InterruptedException{
        driver.findElement(admin).click();
        driver.findElement(Add).click();
    }
}

