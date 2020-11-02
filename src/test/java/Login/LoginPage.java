package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;

    public void Login() throws InterruptedException {
        //Locate the Chromedriver path
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Instantiate the Chromedriver
        driver = new ChromeDriver();
        System.out.println("Chrome driver launched");

        //Maximize window
        driver.manage().window().maximize();
        //Launch Test URL
        driver.get("https://postman.com");
        System.out.println("Website URL entered successfully");

        //Wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Click Sign In button
        driver.findElement(By.linkText("Sign In")).click();
        System.out.println("Sign in page");

        //Enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("******@gmail.com");
        //Enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("********");
        //Click Sign in button
        driver.findElement(By.xpath("//button[@id='sign-in-btn']")).click();

        //Wait for 5000ms
        Thread.sleep(5000);
        System.out.println("Finished Successfully");

        //Quit browser
        driver.quit();
    }

    public  static void main(String args[]) throws InterruptedException
    {
        LoginPage logintest = new LoginPage();
        logintest.Login();
    }

}
