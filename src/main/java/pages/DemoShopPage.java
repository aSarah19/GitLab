package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoShopPage extends BasePage{
    public DemoShopPage (WebDriver driver) {
        super(driver);
    }

    By AwesomeGraniteChips = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a");
    public void ClickOnAwesomeGraniteChips() {driver.findElement(AwesomeGraniteChips).click();}


    By AwesomeMetalChair = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/a");
    public void ClickOnAwesomeMetalChair() {driver.findElement(AwesomeMetalChair).click();}


    By AwesomeSoftShirt = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/a");
    public void ClickOnAwesomeSoftShirt() {driver.findElement(AwesomeSoftShirt).click();}


    By GorgeousSoftPizza = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[1]/a");
    public void ClickOnGorgeousSoftPizza() {driver.findElement(GorgeousSoftPizza).click();}


    By IncredibleConcreteHat = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[5]/div/div[1]/a");
    public void ClickOnIncredibleConcreteHat() {driver.findElement(IncredibleConcreteHat).click();}


    By LicensedSteelGloves = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[6]/div/div[1]/a");
    public void ClickOnLicensedSteelGloves() {driver.findElement(LicensedSteelGloves).click();}


    By PracticalMetalMouse = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[7]/div/div[1]/a");
    public void ClickOnPracticalMetalMouse() {driver.findElement(PracticalMetalMouse).click();}


    By PracticalWoodenBacon = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[8]/div/div[1]/a");
    public void ClickOnPracticalWoodenBacon() {driver.findElement(PracticalWoodenBacon).click();}


    By PracticalWoodenBacon2 = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[9]/div/div[1]/a");
    public void ClickOnPracticalWoodenBacon2() {driver.findElement(PracticalWoodenBacon2).click();}


    By RefinedFrozenMouse = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[10]/div/div[1]/a");
    public void ClickOnRefinedFrozenMouse() {driver.findElement(RefinedFrozenMouse).click();}


    By SearchBar = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]");
    public void ClickOnSearchBar() {driver.findElement(SearchBar).click();}

    By SearchBarAwesomeMetalChair = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/input");
    public void WriteAwesomeMetalChairOnSearchBar(String arg1) {driver.findElement(SearchBarAwesomeMetalChair).sendKeys(arg1);}


    By SearchBarClickIconOnly = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void ClickOnSearchBarIconOnly() {driver.findElement(SearchBarClickIconOnly).click();}


    By SearchByNameAtoZOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]");
    public void ClickOnSearchByNameAtoZOption() {driver.findElement(SearchByNameAtoZOption).click();}

    By SearchByNameZtoAOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select/option[2]");
    public void ClickOnSearchByNameZtoAOption() {driver.findElement(SearchByNameZtoAOption).click();}


    By SortByPriceLowToHigh = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select/option[3]");
    public void ClickOnSortByPriceLowToHigh() {driver.findElement(SortByPriceLowToHigh).click();}


    By SortByPriceHighToLow = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select/option[4]");
    public void ClickOnSortByPriceHighToLow() {driver.findElement(SortByPriceHighToLow).click();}


    By RefreshButtonOnly = By.xpath("/html/body/div/div/div[3]/nav/div/div/div[2]/button");
    public void ClickOnRefreshButton() {driver.findElement(RefreshButtonOnly).click();}


    By IncredibleConcreteHatRefreshPage = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[5]/div/div[1]/a");
    public void ClickOnIncredibleConcreteHatRefreshPage() {driver.findElement(IncredibleConcreteHatRefreshPage).click();}


    By QuestionMarkIcon = By.xpath("/html/body/div/div/div[3]/nav/div/div/div[1]/button");
    public void ClickOnQuestionMarkIcon() {driver.findElement(QuestionMarkIcon).click();}

    By DemoShopBuildDateLink = By.xpath("/html/body/div/div/div[3]/nav/nav/div/div/a");
    public void ClickOnDemoShopBuildDateLink() {driver.findElement(DemoShopBuildDateLink).click();}








}
