package CLASS_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DroppableTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        new Actions(driver).dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
        Thread.sleep(4000);

        new Actions(driver).contextClick().perform();
        Thread.sleep(4000);

        driver.quit();

    }
}
