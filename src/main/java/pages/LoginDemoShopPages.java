package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDemoShopPages extends BasePage {
    public LoginDemoShopPages (WebDriver driver) {
        super(driver);
    }

    By LoginIcon = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/span/button");
    public void ClickOnLoginIcon() {driver.findElement(LoginIcon).click();}


    By InsertUsername = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[1]");
    public void ClickOnInsertUsername() {driver.findElement(InsertUsername).click();}


    By UsernameDino = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[1]");
    public void WriteUsernameDino(String arg1) {driver.findElement(UsernameDino).sendKeys(arg1);}


    By InsertPassword = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[2]");
    public void ClickOnInsertPassword() {driver.findElement(InsertPassword).click();}


    By PasswordChoochoo = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[2]");
    public void WritePasswordChoochoo(String arg1) {driver.findElement(PasswordChoochoo).sendKeys(arg1);}


    By FinishLoginAccountButton = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/button");
    public void ClickOnFinishLoginAccountButton() {driver.findElement(FinishLoginAccountButton).click();}


    By AccountDinoIcon = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/span/a");
    public void ClickOnAccountDinoIcon() {driver.findElement(AccountDinoIcon).click();}


    By LogOutButton = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/button");
    public void ClickOnLogOutButton() {driver.findElement(LogOutButton).click();}
}
