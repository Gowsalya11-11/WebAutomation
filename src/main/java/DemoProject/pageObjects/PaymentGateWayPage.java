package DemoProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentGateWayPage {

    private WebDriver driver; //Initializing the WebDriver

    public PaymentGateWayPage(WebDriver rdriver)// Creating a constructor
    {
        driver = rdriver;
        PageFactory.initElements(rdriver, this); //assigning PageFactory utility provided by selenium for better code format and easy initialization
    }

    @FindBy(xpath = "*//div/ul/li[9]/a")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement paymentGatewayProjectMenuLink;

    @FindBy(xpath = "//select[@name='quantity']")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement selectQuantityDropDown;

    @FindBy(xpath="//*[@value=\"Buy Now\"]")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement buttonBuyNow;

    @FindBy(name = "card_nmuber")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textEnterCardNumber;

    @FindBy(name = "month")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement selectExpirationMonth;

    @FindBy(name = "year")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement selectExpirationYear;

    @FindBy(name = "cvv_code")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textEnterCVVCode;
    @FindBy(name = "submit")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement buttonPayNow;

    public void setPaymentGatewayProjectMenuLink(){
        paymentGatewayProjectMenuLink.click();
    }
    public void setSelectQuantityDropDown(String quantityToPurchase){
        Select select = new Select(selectQuantityDropDown);
        select.selectByValue(quantityToPurchase);
    }
    public void setButtonBuyNow(){
        buttonBuyNow.click();
    }
    public void setTextEnterCardNumber(String cardNumber){
        if( cardNumber!= null) {
            textEnterCardNumber.sendKeys(cardNumber);
        }
    }
    public void setSelectExpirationMonth(String expirationMonth){
        Select select = new Select(selectExpirationMonth);
        select.selectByValue(expirationMonth);
    }
    public void setSelectExpirationYear(String expirationYear){
        Select select = new Select(selectExpirationYear);
        select.selectByValue(expirationYear);
    }

    public void setTextEnterCVVCodeNumber(String CVVcode){
        textEnterCardNumber.sendKeys(CVVcode);
    }
    public void setButtonClickPayNow(){
        buttonPayNow.click();
    }
}
