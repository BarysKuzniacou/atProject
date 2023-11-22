import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "d:\\data\\at\\install\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        /*
        WebElement input = driver.findElement(By.xpath("//textarea[@aria-controls=\"Alh6id\"]"));
        input.click();

        * Не явное ожидание.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        * Явное ожидание.
        WebElement webElement = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
        */

        driver.get("https://www.avito.ru/all/avtomobili");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().window().maximize();

        WebElement webElement = driver.findElement(By.xpath("//a[text()='Audi']"));
        String propertieOffsetWidth = webElement.getAttribute("offsetWidth");
        System.out.println(propertieOffsetWidth);

        //driver.close();

    }
}
