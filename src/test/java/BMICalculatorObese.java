import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMICalculatorObese {
    @Test
    public void categoryTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");

        browser.findElement(By.name("wg")).sendKeys("150");
        browser.findElement(By.name("ht")).sendKeys("150");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Obese", "Категория неверная");

        browser.quit();
    }
}
