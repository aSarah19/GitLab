package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxDemoPage;
import pages.DemoShopPage;

public class DemoShopTestCases extends BasePage {
    private DemoShopPage demoShopPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        demoShopPage = new DemoShopPage(driver);
    }

    @Test
    public void clickOnAwesomeGraniteChips() throws InterruptedException {
        demoShopPage.ClickOnAwesomeGraniteChips();
        driver.navigate().back();
        demoShopPage.ClickOnAwesomeMetalChair();
        driver.navigate().back();
        demoShopPage.ClickOnAwesomeSoftShirt();
        driver.navigate().back();
        demoShopPage.ClickOnGorgeousSoftPizza();
        driver.navigate().back();
        demoShopPage.ClickOnIncredibleConcreteHat();
        driver.navigate().back();
        demoShopPage.ClickOnLicensedSteelGloves();
        driver.navigate().back();
        demoShopPage.ClickOnPracticalMetalMouse();
        driver.navigate().back();
        demoShopPage.ClickOnPracticalWoodenBacon();
        driver.navigate().back();
        demoShopPage.ClickOnPracticalWoodenBacon2();
        driver.navigate().back();
        demoShopPage.ClickOnRefinedFrozenMouse();
        Assert.assertEquals("All products are clicked", "All products are clicked");
    }


}
