package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPages extends BasePage{
    public ShoppingCartPages(WebDriver driver) {
        super(driver);
    }

    By ShoppingCartIcon = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[1]");
    public void ClickOnShoppingCartToOpen() {driver.findElement(ShoppingCartIcon).click();}


    By AddToCartAwesomeGraniteChips = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[1]");
    public void ClickOnAddToCartAwesomeGraniteChips() {driver.findElement(AddToCartAwesomeGraniteChips).click();}


    By AddToCartAwesomeMetalChair = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/button[1]");
    public void ClickOnAddToCartAwesomeMetalChair() {driver.findElement(AddToCartAwesomeMetalChair).click();}


    By AddToShopingCartIcon = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[1]");
    public void ClickOnAddToShoppingCart() {driver.findElement(AddToShopingCartIcon).click();}


    By AddMoreItemAwesomeGraniteChips = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/button[2]");
    public void ClickOnAddMoreItemAwesomeGraniteChips() {driver.findElement(AddMoreItemAwesomeGraniteChips).click();}


    By AddMoreItemAwesomeMetalChair = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/button[2]");
    public void ClickOnAddMoreItemAwesomeMetalChair() {driver.findElement(AddMoreItemAwesomeMetalChair).click();}

    By LessItemAwesomeGraniteChips = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/button[1]");
    public void ClickOnLessItemAwesomeGraniteChips() {driver.findElement(LessItemAwesomeGraniteChips).click();}


    By AddGorgeousSoftPizzaToShoppingCart = By.xpath("/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]");
    public void ClickOnAddToCartGorgeousSoftPizza() {driver.findElement(AddGorgeousSoftPizzaToShoppingCart).click();}


    By TrashIconGorgeousSoftPizza = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div[5]/button");
    public void ClickOnTrashIconGorgeousSoftPizza() {driver.findElement(TrashIconGorgeousSoftPizza).click();}


    By GorgeousSoftPizza = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[1]/a");
    public void ClickOnGorgeousSoftPizza() {driver.findElement(GorgeousSoftPizza).click();}


    By CheckoutButton = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/a[2]");
    public void ClickOnCheckoutButton() {driver.findElement(CheckoutButton).click();}

    By FirstName = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[1]/div[2]/input[1]");
    public void ClickOnFirstName() {driver.findElement(FirstName).click();}

    By FirstNameSarah = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[1]/div[2]/input[1]");
    public void WriteFirstNameSarah(String arg1) {driver.findElement(FirstNameSarah).sendKeys(arg1);}


    By LastName = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[1]/div[2]/input[2]");
    public void ClickOnLastName() {driver.findElement(LastName).click();}

    By LastNameAntonie = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[1]/div[2]/input[2]");
    public void WriteLastNameAntonie(String arg1) {driver.findElement(LastNameAntonie).sendKeys(arg1);}

    By Address = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[1]/div[2]/textarea");
    public void ClickOnAddress() {driver.findElement(Address).click();}

    By WriteTheAddress = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[1]/div[2]/textarea");
    public void WriteTheAddressSection(String arg1) {driver.findElement(WriteTheAddress).sendKeys(arg1);}


    By DeliveryInformation = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[2]/div[2]/div");
    public void SelectDelivery() {driver.findElement(DeliveryInformation).click();}


    By PaymentInformation = By.xpath("/html/body/div/div/div[2]/form/div/div[1]/div[2]/div[4]/div[1]");
    public void SelectPaymentOption() {driver.findElement(PaymentInformation).click();}

    By ContinueCheckoutButton = By.xpath("/html/body/div/div/div[2]/form/div/div[2]/button");
    public void ClickOnContinueCheckoutButton() {driver.findElement(ContinueCheckoutButton).click();}

    By CompleteYourOrder = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/a[2]");
    public void ClickOnCompleteYourOrder() {driver.findElement(CompleteYourOrder).click();}

    By ContinueShoppingButton = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/a");
    public void ClickOnContinueShoppingButton() {driver.findElement(ContinueShoppingButton).click();}















}
