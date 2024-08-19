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

        System.out.println("==============getText========================");
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
       for(WebElement element: webElements){

           //System.out.println(element.getText());
           System.out.println(element.getText()+" "+element.getAttribute("href"));
       }
        System.out.println("======================================");
       //Fetch value from dom: getText();
        //Click any button, link,url use click();
        // Send value in UI use sendKeys();



    }
}
