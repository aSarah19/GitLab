package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomeButtonPage;
import pages.WishlistPage;

public class HomeButtonTestCases extends BasePage {
    private HomeButtonPage homeButtonPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        homeButtonPage= new HomeButtonPage(driver);
    }

    @Test
    public void ClickOnHomeButton() throws InterruptedException {
        homeButtonPage.ClickOnRefinedFrozenMouse();
        homeButtonPage.ClickOnHomeButtonIcon();
    }

    @Test
    public void ClickJustOnHomeButton() throws InterruptedException {
        homeButtonPage.ClickOnlyOnHomeButton();
    }

}
