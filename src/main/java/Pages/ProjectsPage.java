package Pages;

import Configuration.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends PageObject {

    @FindBy(xpath = "//div/a[@class = \"btn back-button-project\"]")
    private WebElement btnBack;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[1]")
    private WebElement btnKidneyDiseaseAI;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[2]")
    private WebElement btnBalticMarinas;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[3]")
    private WebElement btnPersonalWebsite;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[4]")
    private WebElement btnUnitConverter;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[5]")
    private WebElement btnRealEstate;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[6]")
    private WebElement btnSpaceShooter;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[7]")
    private WebElement btnJobTrack;

    @FindBy(xpath = "(//div/a[@class = \"btn read-more-button-projects\"])[8]")
    private WebElement btnTicTacToe;

    public ProjectsPage(WebDriver driver)
    {
        super(driver);
    }

    public HomePage navigateToHomePage()
    {
        btnBack.click();

        return new HomePage(this.driver);
    }

    public ChronicalKidneyDiseaseAIPage navigateToChronicalKidneyDiseaseAIPage()
    {
        btnKidneyDiseaseAI.click();

        return new ChronicalKidneyDiseaseAIPage(this.driver);
    }
}
