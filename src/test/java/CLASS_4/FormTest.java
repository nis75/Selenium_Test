package CLASS_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FormTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("firstName")).sendKeys("Niamul Islam");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("Shimul");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("niamul.islam@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("userNumber")).sendKeys("1723339875");
        Thread.sleep(2000);
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("test");
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        select.selectByValue("7");
        Thread.sleep(2000);
        driver.findElement(By.className("react-datepicker__day--022")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("subjectsContainer")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
        Thread.sleep(2000);

    }
}
