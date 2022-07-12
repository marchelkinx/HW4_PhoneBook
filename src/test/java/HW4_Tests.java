import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HW4_Tests {

    WebDriver wd;

    @BeforeMethod
    public void preConditions(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    @Test
    public void test1(){
        List<WebElement> elements = wd.findElements(By.tagName("button"));
        WebElement element1 = wd.findElement(By.id("root"));
        WebElement element2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element3 = wd.findElement(By.cssSelector("#root"));
        WebElement element4 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement element5 = wd.findElement(By.cssSelector("a[href='/login']"));
        WebElement element6 = wd.findElement(By.cssSelector("[href^='/l']"));
        WebElement element7 = wd.findElement(By.cssSelector("[href*='og']"));
        WebElement element8 = wd.findElement(By.cssSelector("[placeholder*='ss']"));

    }

    @AfterMethod
    public void postConditions(){
        wd.quit();
    }
}
