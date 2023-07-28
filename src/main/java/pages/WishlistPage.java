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

    By VerifyWish= By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[2]");

    public void ClickOnVerifyWish() {driver.findElement(VerifyWish).click();}


    }




