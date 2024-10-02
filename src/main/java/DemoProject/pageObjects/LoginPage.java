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

//    @BeforeMethod
//    public void setUp() {
//        //System.setProperty("src//main//resources//driver//chromedriver.exe"); // Replace with the actual path to your ChromeDriver
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void loginToOpenCart() {
//        driver.get("https://demo.opencart.com/");
//
//        // Find the login link and click it
//        driver.findElement(By.linkText("My Account")).click();
//        driver.findElement(By.linkText("Login")).click();
//
//        // Locate the email and password fields
//        driver.findElement(By.id("input-email")).sendKeys("your_email@example.com");
//        driver.findElement(By.id("input-password")).sendKeys("your_password");
//
//        // Click the login button
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//        // Verify successful login (e.g., check for a welcome message)
//        String welcomeMessage = driver.findElement(By.xpath("//h2[contains(text(), 'My Account')]")).getText();
//        assert welcomeMessage.contains("My Account");
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
//}
}
