package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    By AwesomeGraniteChips = By.linkText("Awesome Granite Chips");
    public void ClickOnAwesomeGraniteChips() {driver.findElement(AwesomeGraniteChips).click();}

    By AwesomeGraniteChipsHeartIcon = By.xpath("/html/body/div/div/div[2]/div[2]/div/div[3]/button[2]");
    public void ClickOnAwesomeGraniteChipsHeartIcon() {driver.findElement(AwesomeGraniteChipsHeartIcon).click();}

    By OpenWishlistIcon= By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[2]");

    public void ClickOnOpenWishlistIcon() {driver.findElement(OpenWishlistIcon).click();}


    By AwesomeMetalChair = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/a");
    public void ClickOnAwesomeMetalChair() {driver.findElement(AwesomeMetalChair).click();}


    By AwesomeSoftShirt = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/a");
    public void ClickOnAwesomeSoftShirt() {driver.findElement(AwesomeSoftShirt).click();}


    By GorgeousSoftPizza = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[1]/a");
    public void ClickOnGorgeousSoftPizza() {driver.findElement(GorgeousSoftPizza).click();}


    By PutOnWishlistAwesomeMetalChair = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/button[2]");
    public void ClickOnPutOnWishlistAwesomeMetalChair() {driver.findElement(PutOnWishlistAwesomeMetalChair).click();}

    By PutOnWishlistAwesomeSoftShirt = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/button[2]");
    public void ClickOnPutOnWishlistAwesomeSoftShirt() {driver.findElement(PutOnWishlistAwesomeSoftShirt).click();}

    By PutOnWishlistGorgeousSoftPizza = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[2]/button[2]");
    public void ClickOnPutOnWishlistGorgeousSoftPizza() {driver.findElement(PutOnWishlistGorgeousSoftPizza).click();}


    By DeleteFromWishlistAwesomeMetalChair = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[2]");
    public void ClickOnDeleteFromWishlistAwesomeMetalChair() {driver.findElement(DeleteFromWishlistAwesomeMetalChair).click();}


    By DeleteFromWishlistAwesomeSoftShirt = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/button[2]");
    public void ClickOnDeleteFromWishlistAwesomeSoftShirt() {driver.findElement(DeleteFromWishlistAwesomeSoftShirt).click();}


    By DeleteFromWishlistGorgeousSoftPizza = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div[2]/button[2]");
    public void ClickOnDeleteFromWishlistGorgeousSoftPizza() {driver.findElement(DeleteFromWishlistGorgeousSoftPizza).click();}




    }




