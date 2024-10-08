package DemoProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

    private WebDriver driver; //Initializing the WebDriver

    public NewAccountPage(WebDriver rdriver)// Creating a constructor
    {
        driver = rdriver;
        PageFactory.initElements(rdriver, this); //assigning PageFactory utility provided by selenium for better code format and easy initialization
    }

    @FindBy(name = "cusid")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textCustomerName;

    @FindBy(xpath = "//select[@name='selaccount']")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement selectCustomerAccountType;

    @FindBy(name = "inideposit")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textInitialDepositAmount;

    @FindBy(name = "button2")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement buttonSubmit;

    @FindBy(xpath = "*//ul[@class=\"menusubnav\"]/li[5]")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement newAccountLink;

    public void setNewAccountMenuLink(){
        newAccountLink.click();
    }

    public void setCustomerName(String customerName){
        textCustomerName.sendKeys(customerName);
    }
    public void setInitialAmount(String depositAmount){
        textInitialDepositAmount.sendKeys(depositAmount);
    }
    public void setSelectCustomerAccount(String setSelectCustomerAccount){
        Select select = new Select(selectCustomerAccountType);
        select.selectByValue(setSelectCustomerAccount);
    }
    public void clickSubmit(){
        buttonSubmit.click();
    }
}
