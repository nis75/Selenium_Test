package CLASS_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        System.out.println("======================================");
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
       for(WebElement element: webElements){
           System.out.println(element.getText());
       }
        System.out.println("======================================");



    }
}
