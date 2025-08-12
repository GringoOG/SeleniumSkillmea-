import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


public class SelTestTutorialPointCheck {

    private WebDriver ovladac;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MiroslavPěček\\IdeaProjects\\SeleniumSkillmea\\src\\main\\resources\\chromedriver.exe");
        ovladac = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        ovladac.quit();
    }

    @Test
    public void checkboxTest() {

        ovladac.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");



    }

}
