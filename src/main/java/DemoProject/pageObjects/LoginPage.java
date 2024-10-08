package DemoProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver; //Initializing the WebDriver

    public LoginPage(WebDriver rdriver)// Creating a constructor
    {
        driver = rdriver;
        PageFactory.initElements(rdriver, this); //assigning PageFactory utility provided by selenium for better code format and easy initialization
    }

    @FindBy(name = "uid")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textUserName;

    @FindBy(name = "password")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement textUserPassword;

    @FindBy(name = "btnLogin")//used FindBy annotation to specify locators id,name,xpath and each locator value
    @CacheLookup//annotation to catch the elements for better performance
    WebElement buttonLogin;

    public void setUserName(String userName){
        textUserName.sendKeys(userName);
    }
    public void setPassword(String userPassword){
        textUserPassword.sendKeys(userPassword);
    }
    public void clickSubmit(){
        buttonLogin.click();
    }
}
