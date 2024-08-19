package CLASS_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsNameTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("============================");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(2000);


        System.out.println("============================");
        driver.quit();

    }
}
