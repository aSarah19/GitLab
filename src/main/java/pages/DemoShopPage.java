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

    public void ClickOnAwesomeMetalChair() {driver.findElement(AwesomeGraniteChips).click();}


    By AwesomeSoftShirt = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/a");

    public void ClickOnAwesomeSoftShirt() {driver.findElement(AwesomeGraniteChips).click();}


    By GorgeousSoftPizza = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[1]/a");

    public void ClickOnGorgeousSoftPizza() {driver.findElement(AwesomeGraniteChips).click();}


    By IncredibleConcreteHat = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[5]/div/div[1]/a");

    public void ClickOnIncredibleConcreteHat() {driver.findElement(AwesomeGraniteChips).click();}


    By LicensedSteelGloves = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[6]/div/div[1]/a");

    public void ClickOnLicensedSteelGloves() {driver.findElement(AwesomeGraniteChips).click();}


    By PracticalMetalMouse = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[7]/div/div[1]/a");

    public void ClickOnPracticalMetalMouse() {driver.findElement(AwesomeGraniteChips).click();}


    By PracticalWoodenBacon = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[8]/div/div[1]/a");

    public void ClickOnPracticalWoodenBacon() {driver.findElement(AwesomeGraniteChips).click();}


    By PracticalWoodenBacon2 = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[9]/div/div[1]/a");

    public void ClickOnPracticalWoodenBacon2() {driver.findElement(AwesomeGraniteChips).click();}


    By RefinedFrozenMouse = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[10]/div/div[1]/a");

    public void ClickOnRefinedFrozenMouse() {driver.findElement(AwesomeGraniteChips).click();}








}
