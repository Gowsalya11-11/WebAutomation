package DemoProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TelecomPayment {

    private WebDriver driver; //Initializing the WebDriver
   // Creating Implicit wait

    public TelecomPayment(WebDriver rdriver)// Creating a constructor
    {
        driver = rdriver;
        PageFactory.initElements(rdriver, this); //assigning PageFactory utility provided by selenium for better code format and easy initialization
    }
//     driver = new ChromeDriver();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

    @FindBy(xpath = "*//div/ul/li[8]/a")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement telecomProjectMenuLink;

    @FindBy(xpath = "//div[@class='flex-item left'] //a[contains (text(),'Add Customer')] ")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement addCustomerLink;

    @FindBy(xpath = "//input[@type='radio' and @id='done']")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement selectbackgroundCheck;

    @FindBy(name="fname")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textCustomerFirstName;

    @FindBy(name="lname")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textCustomerLastName;

    @FindBy(name="emailid")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textCustomerEmailId;

    @FindBy(name = "addr")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textCustomerAddress;

    @FindBy(name = "telephoneno")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textCustomerPhoneNumber;

    @FindBy(name = "submit")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement buttonSubmit;

    @FindBy(xpath = "//td[2]")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement newCustomerId;

    public void setTelecomProjectMenuLink(){
        telecomProjectMenuLink.click();
    }
//    public void setAddCustomerLink() throws InterruptedException {
////        wait.until(ExpectedConditions.visibilityOf(addCustomerLink));
//        addCustomerLink.click();
//    }
//    public void setSelectbackgroundCheck() throws InterruptedException {
//        Thread.sleep(2000);
//        selectbackgroundCheck.click();
//    }
    public void setTextCustomerFirstName(String customerName){
        textCustomerFirstName.sendKeys(customerName);
    }
    public void setTextCustomerLastName(String customerName){
        textCustomerLastName.sendKeys(customerName);
    }
    public void setTextCustomerEmailId(String customerName){
        textCustomerEmailId.sendKeys(customerName);
    }
    public void setTextCustomerAddress(String customerName){
        textCustomerAddress.sendKeys(customerName);
    }
    public void setTextCustomerPhoneNumber(String customerPhoneNumber){
        textCustomerPhoneNumber.sendKeys(customerPhoneNumber);
    }

    public void clickSubmit(){
        buttonSubmit.click();
    }

}
