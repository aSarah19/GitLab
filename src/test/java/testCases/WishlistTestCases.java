package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.WishlistPage;

public class WishlistTestCases extends BasePage {
    private WishlistPage heartIconPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        heartIconPage = new WishlistPage(driver);
    }


    @Test
    public void clickOnAwesomeGraniteChipsHeartIcon() throws InterruptedException {
        heartIconPage.ClickOnAwesomeGraniteChips();
        heartIconPage.ClickOnAwesomeGraniteChipsHeartIcon();



    }
}

