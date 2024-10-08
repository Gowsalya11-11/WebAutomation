package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {
    public String baseURL="https://demo.guru99.com/v3/index.php";
    public String userName="mngr595311";
    public String userPassword="AbUpere";
    public static WebDriver driver;
    public String quantityToPurchase ="5";
//    public String cardNumber="1234567812349876";
//    public String expirationMonth="5";
//    public String expirationYear="2028";
//    public String CVVcode="555";


    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources//Drivers//chromedriver.exe");
        driver= new ChromeDriver();
    }

    @AfterClass
    public void tearDown(){
      driver.quit();
    }

}
