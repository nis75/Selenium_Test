package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class SauceDemoTest {
    @Test
    public void checkTittle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Assertion
        Assert.assertEquals(driver.getTitle(), "Swag Labs");

//        String expectedTitle = "Swag Labs";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(expectedTitle, actualTitle);


        driver.quit();
    }
    @Test
    public void checkUrl() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
        driver.quit();
    }
    @Test
    public void loginFail_wrongUser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Assertion
        driver.findElement(By.id("user-name")).sendKeys("standard_user.");
        driver.findElement(By.id("login-button")).click();
        //Assert.assertEquals(driver.findElement(""), "https://www.saucedemo.com/");
        //error-message-container
        int count = driver.findElements(By.className("error-message-container")).size();
        Assert.assertEquals(count,1);


        //driver.quit();
    }
    @Test
    public void loginFail_wrongPass() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Assertion
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce.");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        //Assert.assertEquals(driver.findElement(""), "https://www.saucedemo.com/");
        //error-message-container
        int count = driver.findElements(By.className("error-message-container")).size();
        Assert.assertEquals(count,1);


        //driver.quit();
    }
    @Test
    public void loginPass() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Assertion
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        //Assert.assertEquals(driver.findElement(""), "https://www.saucedemo.com/");
        //error-message-container
//        int count = driver.findElements(By.className("error-message-container")).size();
//        Assert.assertEquals(count,1);

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);

        String logoutText = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(logoutText,"Logout");



        //driver.quit();
    }

}


