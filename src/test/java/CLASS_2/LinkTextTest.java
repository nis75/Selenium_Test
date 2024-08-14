package CLASS_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
         driver.findElement(By.linkText("Register")).click();
         Thread.sleep(1000);
         driver.findElement(By.partialLinkText("got log")).click();
        Thread.sleep(1000);



    }
}
