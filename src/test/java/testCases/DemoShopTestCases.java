package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DemoShopPage;

public class DemoShopTestCases extends BasePage {
    private DemoShopPage demoShopPage;

    @BeforeMethod
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


    @Test
    public void WriteOnSearchBar() throws InterruptedException {
        demoShopPage.ClickOnSearchBar();
        demoShopPage.WriteAwesomeMetalChairOnSearchBar("Awesome Metal Chair");
    }

    @Test
    public void ClickOnTheSearchBarIconOnly() throws InterruptedException {
        demoShopPage.ClickOnSearchBarIconOnly();
    }


    @Test
    public void SelectAllSearchingOptions() throws InterruptedException {
        demoShopPage.ClickOnSearchByNameAtoZOption();
        demoShopPage.ClickOnSearchByNameZtoAOption();
        demoShopPage.ClickOnSortByPriceLowToHigh();
        demoShopPage.ClickOnSortByPriceHighToLow();
        Assert.assertEquals("All options are checked.", "All options are checked.");
    }


    @Test
    public void ClickOnTheRefreshButtonOnly() throws InterruptedException {
        demoShopPage.ClickOnRefreshButton();
    }


    @Test
    public void RefreshThePageFromProducts() throws InterruptedException {
        demoShopPage.ClickOnIncredibleConcreteHatRefreshPage();
        demoShopPage.ClickOnRefreshButton();

    }

    @Test
    public void ClickOnQuestionMarkButton() throws InterruptedException {
        demoShopPage.ClickOnQuestionMarkIcon();
    }

    @Test
    public void LinkDemoShopBuildDateOpen() throws InterruptedException {
        demoShopPage.ClickOnDemoShopBuildDateLink();
    }

    @Test
    public void RefreshToSeeChangingColourProductPhoto() throws InterruptedException{
        demoShopPage.ClickOnLicensedSteelGloves();
        demoShopPage.ClickOnRefreshButton();
        demoShopPage.ClickOnRefreshButton();
        demoShopPage.ClickOnRefreshButton();
        demoShopPage.ClickOnRefreshButton();
        demoShopPage.ClickOnRefreshButton();
        demoShopPage.ClickOnRefreshButton();
    }




}





