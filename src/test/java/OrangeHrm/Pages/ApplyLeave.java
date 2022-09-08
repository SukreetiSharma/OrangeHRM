package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ApplyLeave {
    WebDriver driver;
    By Leave = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]");
    By Apply = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]");
    By Select = By.xpath("//div[@class='oxd-select-text-input']");
    By Value = By.xpath("//*[contains(text(),'CAN - Bereavement')]");
    By FromDate = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By ApplyLeave = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public ApplyLeave(WebDriver driver) {
        this.driver = driver;
    }

    public void applyLeave() throws InterruptedException {
        driver.findElement(Leave).click();
        driver.findElement(Apply).click();
        driver.findElement(Select).click();
        driver.findElement(Value).click();
        driver.findElement(FromDate).sendKeys("2022-09-12");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(ApplyLeave).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
