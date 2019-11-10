package TestsConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Firefox\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void cleanUp()
    {
        //driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown()
    {
        driver.close();
    }
}
