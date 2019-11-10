package PageTests;

import Pages.HomePage;
import TestsConfiguration.FunctionalTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends FunctionalTest {

    @Test
    public void fillMessageForm()
    {
        String email = "Test@email.com";
        String subject = "About Test";
        String message = "Testing Message Form";

        driver.get("http://edgaras-cv.herokuapp.com");

        HomePage homePage = new HomePage(driver);
        homePage.fillMessageForm(email, subject, message);

        Assert.assertEquals(homePage.getEmailValue(), email, "'Email' is expected to be equal with provided data");
        Assert.assertEquals(homePage.getSubjectValue(), subject, "'Subject' is expected to be equal with provided data");
        Assert.assertEquals(homePage.getMessageValue(), message, "'Message' is expected to be equal with provided data");
    }


    @Test
    public void navigateToProjectsPage()
    {
        String expectedURL = "http://edgaras-cv.herokuapp.com/projects";

        driver.get("http://edgaras-cv.herokuapp.com");

        HomePage homePage = new HomePage(driver);
        homePage.navigateToProjectsPage();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe(expectedURL));

        String URL = driver.getCurrentUrl();

        Assert.assertEquals(URL, expectedURL, "'URL' is expected to be equal with provided data");
    }
}
