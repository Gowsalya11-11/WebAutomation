package test;

import DemoProject.pageObjects.LoginPage;
import DemoProject.pageObjects.NewAccountPage;
import org.testng.annotations.Test;

public class TestNewCustomerAccountCreation_003 extends BaseClass {
    @Test
    public void accountCreation() throws InterruptedException {
        driver.get(baseURL);

        LoginPage loginpage= new LoginPage(driver);
        loginpage.setUserName(userName);
        loginpage.setPassword(userPassword);
        loginpage.clickSubmit();
        Thread.sleep(5000);
        NewAccountPage customerAccount= new NewAccountPage(driver);
        customerAccount.setNewAccountMenuLink();
        Thread.sleep(2000);
        customerAccount.setCustomerName(userName);
        customerAccount.setSelectCustomerAccount("Savings");
        customerAccount.setInitialAmount(userPassword);
        customerAccount.clickSubmit();
         }

}
