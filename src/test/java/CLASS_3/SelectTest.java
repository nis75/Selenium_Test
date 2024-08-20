package CLASS_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
       // driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
       //  Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Nusaiba Rahman");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Naba");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("01723339875");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("nusaiba@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Ghonibishnopur, Ruhea");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Thakurgaon");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Rangpur");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("5302");
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));
       select.selectByIndex(2);//select by index
        Thread.sleep(2000);
       select.selectByValue("AUSTRIA");//select by value
        Thread.sleep(2000);
        select.selectByVisibleText("EGYPT");//select by text
        Thread.sleep(2000);
        for (WebElement element : select.getOptions()) {
            System.out.println(element.getText());
        }
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("nusaiba@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("naba@123");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("naba@123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(2000);












    }
}
