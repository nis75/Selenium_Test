package CLASS_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramesTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //frame1
        System.out.println("==================Main iframe========================================");
        System.out.println("Main iframe: "+driver.findElement(By.className("text-center")).getText());
        Thread.sleep(2000);
        System.out.println("==================Inside iframe1=====================================");
        driver.switchTo().frame("frame1");
        System.out.println("Inside iframe1: "+driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        System.out.println("==================Inside iframe2=====================================");
        driver.switchTo().frame("frame2");
        System.out.println("Inside iframe2: "+driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        System.out.println("=====================================================================");

        driver.quit();

    }
}
