package CLASS_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebInfoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println("========================================");

        System.out.println("Tag Name: " + driver.findElement(By.id("user-name")).getTagName());

        System.out.println("Height: " + driver.findElement(By.id("user-name")).getRect().height
                +" Width: "+driver.findElement(By.id("user-name")).getRect().width
                +" X: "+driver.findElement(By.id("user-name")).getRect().x
                +" Y: "+driver.findElement(By.id("user-name")).getRect().y);

        WebElement element = driver.findElement(By.id("login-button"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getAttribute("class"));

        System.out.println("========================================");







        Thread.sleep(2000);
        driver.quit();










    }
}
