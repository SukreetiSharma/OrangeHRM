package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.time.Duration;

public class Adduser {
    WebDriver driver;
    By userRoleDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    By Admin = By.xpath("//*[contains(text(),'Admin')]");
    By employeeName = By.xpath("(//div/input)[2]");
    By statusDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By Odis = By.xpath("//*[contains(text(),'Odis')]");
    By Enabled = By.xpath("//*[contains(text(),'Enabled')]");
    By username = By.xpath("(//div/input[@class='oxd-input oxd-input--active'])[2]");
    By password = By.xpath("(//div/input[@type='password'])[1]");
    By confirmPassword = By.xpath("(//div/input[@type='password'])[2]");
    By saveButton = By.xpath("//button[@type='submit']");
    By userNameVerify = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By userRoleVerify = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    By adminVerify = By.xpath("//*[contains(text(),'Admin')]");
    By searchVerify = By.xpath("//button[@type='submit']");
    String uniquename;

    public Adduser(WebDriver driver) {
        this.driver = driver;
    }

    public void userDetails() throws InterruptedException {
        String randomNumber = String.valueOf((int) (Math.random() * (100 - 50 + 1) + 50));
        uniquename = "OdisAdmin123" + randomNumber;
        driver.findElement(userRoleDropdown).click();
        driver.findElement(Admin).click();
        driver.findElement(employeeName).sendKeys("Odis");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(Odis).click();
        driver.findElement(statusDropdown).click();
        driver.findElement(Enabled).click();
        driver.findElement(username).sendKeys(uniquename);
        driver.findElement(password).sendKeys("Admin@123");
        driver.findElement(confirmPassword).sendKeys("Admin@123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(saveButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    public void verifyUserIsAdded(){
        driver.findElement(userNameVerify).sendKeys(uniquename);
        driver.findElement(userRoleVerify).click();
        driver.findElement(adminVerify).click();
        driver.findElement(searchVerify).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        boolean isAdminDisplayed = driver.findElement(By.xpath(String.format("//div[contains(text(),'%s')]", uniquename))).isDisplayed();
        Assert.assertTrue(isAdminDisplayed, "User is not added");
    }
}
