import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRMLoginAutomation {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        System.setProperty("webdriver.gecko.driver",
                "D:\\Download\\webdriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        // Navigate to the URL
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Find username and password fields and login button

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");


        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();



        String at = driver.getTitle();
        System.out.println(at);
        String et = "OrangeHRM";


        if (at.equalsIgnoreCase(et)) {
            System.out.println("Login successful. Dashboard page is displayed.");
        } else {
            System.out.println("Login failed. Dashboard page is not displayed.");
        }
        // Close the browser
        driver.quit();

    }
}