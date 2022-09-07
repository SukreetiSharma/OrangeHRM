package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;
    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By Login = By.xpath("//button");

    public LoginPage(WebDriver driver){

        this.driver=driver;
    }


    public void login() throws InterruptedException{
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(userName).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(Login).click();
        Thread.sleep(5000);
    }



}
