package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeButtonPage extends BasePage {
    public HomeButtonPage(WebDriver driver) {
        super(driver);
    }

    By RefinedFrozenMouse = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[10]/div/div[1]/a");

    public void ClickOnRefinedFrozenMouse() {driver.findElement(RefinedFrozenMouse).click();}

    By HomeButtonIcon = By.xpath("/html/body/div/div/div[1]/nav");

    public void ClickOnHomeButtonIcon() {driver.findElement(HomeButtonIcon).click();}


    By HomeButtonOnly = By.xpath("/html/body/div/div/div[1]/nav");

    public void ClickOnlyOnHomeButton() {driver.findElement(HomeButtonIcon).click();}
}
