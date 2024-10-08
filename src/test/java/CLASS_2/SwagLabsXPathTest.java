package CLASS_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsXPathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("============================");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        //cssSelector: input[placeholder='Username']
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        //
        xpath: //input[@class='submit-button btn_action']
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        Thread.sleep(2000);


        System.out.println("============================");
        driver.quit();

    }
}
