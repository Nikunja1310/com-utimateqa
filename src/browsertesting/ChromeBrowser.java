package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-5 - Project Name: com-utimateqa
 * BaseUrl =
 * https://courses.ultimateqa.com/users/sign_in
 */
public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //launch Chrome
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //maximise
        driver.manage().window().maximize();
        //impilcit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get and print Title
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
