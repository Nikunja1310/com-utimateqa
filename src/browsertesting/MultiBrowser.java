package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseURL = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser name.");
        }

        //open URL
        driver.get(baseURL);
        //maximise
        driver.manage().window().maximize();
        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get and print title
        System.out.println(driver.getTitle());
        //Current URL and print
        System.out.println("Current URL" + driver.getCurrentUrl());
        //Get and print page Source
        System.out.println("Page Source : " + driver.getPageSource());
        //Find email field element and enter the same
        driver.findElement(By.id("user[email]")).sendKeys("nikkisen13@gmail.com");
        //Find Password field element and enter the same
        driver.findElement(By.id("user[password]")).sendKeys("Nikkk123");

        //Close the Browser
        driver.close();
    }
}



