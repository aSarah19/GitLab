package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPages extends BasePage {
    public ProductsPages(WebDriver driver) {
        super(driver);
    }

    By FirstProductAdd = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[1]");
    public void AddToCartFirstProduct() {driver.findElement(FirstProductAdd).click();}

    By SecondProductAdd = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/button[1]");
    public void AddToCartSecondProduct() {driver.findElement(SecondProductAdd).click();}

    By ThirdProductAdd = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/button[1]");
    public void AddToCartThirdProduct() {driver.findElement(ThirdProductAdd).click();}

    By ResetThePage = By.xpath("/html/body/div/div/div[3]/nav/div/div/div[2]/button");
    public void ClickToResetThePage() {driver.findElement(ResetThePage).click();}




    By LoginButton = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/span/button");
    public void ClickToLoginButton() {driver.findElement(LoginButton).click();}

    By UsernameLogin = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[1]");
    public void ClickToUsername() {driver.findElement(UsernameLogin).click();}

    By WriteUsername = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[1]");
    public void ClickToWriteUsername(String arg1) {driver.findElement(WriteUsername).sendKeys(arg1);}

    By PasswordLogin = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[2]");
    public void ClickToPassword() {driver.findElement(PasswordLogin).click();}

    By WritePassword = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/input[2]");
    public void ClickToWritePassword(String arg1) {driver.findElement(WritePassword).sendKeys(arg1);}

    By ContinueFinishLogin = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/button");
    public void ClickToLogin() {driver.findElement(ContinueFinishLogin).click();}

   By SearchBar = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]");
    public void ClickToSearch() {driver.findElement(SearchBar).click();}

    By SearchProduct = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/input");
    public void SearchByLetter(String arg1) {driver.findElement(SearchProduct).sendKeys(arg1);}

    By FinishToSearch = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void ClickToFinishToSearch() {driver.findElement(FinishToSearch).click();}





}
