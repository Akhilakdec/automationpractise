import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Automation01 {

    public static void main (String[] arg) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\kisho\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@class = 'oxd-main-menu-item']")).click();
        driver.findElement(By.xpath("(//input[@class = 'oxd-input oxd-input--active'])[2]")).sendKeys("ABCDE");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[text()='Admin']"));
        driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
        /*Validation*/
        String actualText = driver.findElement(By.xpath("//span[text()='No Records Found']")).getText();
        String expectedText = "No Records Found";
        Assert.assertEquals(expectedText, actualText);
        /*Addition*/
        driver.findElement(By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class ='oxd-select-text oxd-select-text--active']")).click();
        driver.findElement(By.xpath("(//div[@class ='oxd-select-text oxd-select-text--active'])[1]"));
        driver.findElement(By.xpath("//input[@placeholder= 'Type for hints...']")).sendKeys("ABCD");
        driver.findElement(By.xpath("(//div[@class= 'oxd-select-text oxd-select-text--active'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class= 'oxd-select-text-input'])[2]")).click();
        driver.findElement(By.xpath("(//input[@class= 'oxd-input oxd-input--active'])[2]")).sendKeys("Test01");
        driver.findElement(By.xpath("(//input[@class= 'oxd-input oxd-input--active'])[2]")).sendKeys("Password123");
                driver.findElement(By.xpath("(//input[@class= 'oxd-input oxd-input--active'])[2]")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
/*leave*/
        driver.findElement(By.xpath("//a[@class= 'oxd-main-menu-item active']")).click();
        driver.findElement(By.xpath("//i[@class= 'oxd-icon bi-calendar oxd-date-input-icon']")).click();
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
                driver.close();
        System.out.println("Code executed successfully");
    }}

