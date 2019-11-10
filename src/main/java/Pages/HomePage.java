package Pages;


import Configuration.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(id = "button-projects")
    private WebElement btnProjects;

    @FindBy(id = "button-github")
    private WebElement btnGithub;

    @FindBy(id = "button-linkedin")
    private WebElement btnLinkedin;

    @FindBy(xpath = "//input[@name = 'email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//input[@name = 'subject']")
    private WebElement txtSubject;

    @FindBy(xpath = "//textarea[@name = 'message']")
    private WebElement txtMessage;

    @FindBy(xpath = "//input[@class = 'inquiry-buttons' and @value = 'Send']")
    private WebElement btnSend;

    @FindBy(xpath = "//input[@class = 'inquiry-buttons' and @value = 'Clear']")
    private WebElement btnClear;

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public HomePage fillMessageForm(String email, String subject, String message)
    {
        txtEmail.sendKeys(email);
        txtSubject.sendKeys(subject);
        txtMessage.sendKeys(message);

        return new HomePage(this.driver);
    }

    public HomePage activateSendButton()
    {
        btnSend.click();

        return new HomePage(this.driver);
    }

    public HomePage activateClearButton()
    {
        btnClear.click();

        return new HomePage(this.driver);
    }

    public String getEmailValue()
    {
        return txtEmail.getAttribute("value");
    }

    public String getSubjectValue()
    {
        return txtSubject.getAttribute("value");
    }

    public String getMessageValue()
    {
        return txtMessage.getAttribute("value");
    }

    public ProjectsPage navigateToProjectsPage()
    {
        btnProjects.click();

        return new ProjectsPage(this.driver);
    }
}
