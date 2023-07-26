package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    By AwesomeGraniteChips = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a");
    public void ClickOnAwesomeGraniteChips() {driver.findElement(AwesomeGraniteChips).click();}

    By AwesomeGraniteChipsHeartIcon = By.xpath("/html/body/div/div/div[2]/div[2]/div/div[3]/button[2]/svg/path");
    public void ClickOnAwesomeGraniteChipsHeartIcon() {driver.findElement(AwesomeGraniteChipsHeartIcon).click();}


}
