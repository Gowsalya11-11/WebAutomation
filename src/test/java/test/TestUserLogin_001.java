package test;

import DemoProject.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUserLogin_001 extends BaseClass {
    @Test
    public void loginTest(){
        driver.get(baseURL);

        LoginPage loginpage= new LoginPage(driver);
        loginpage.setUserName(userName);
        loginpage.setPassword(userPassword);
        loginpage.clickSubmit();
        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){

            Assert.assertTrue(true);
        }else
            Assert.fail();
    }

}
