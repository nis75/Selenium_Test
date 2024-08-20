package CLASS_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();

        WebDriver.Navigation navigation = driver.navigate();
        navigation.to("https://www.saucedemo.com/");
        Thread.sleep(2000);
        navigation.back();
        Thread.sleep(2000);
        navigation.forward();
        Thread.sleep(2000);
        navigation.refresh();
    }
}
