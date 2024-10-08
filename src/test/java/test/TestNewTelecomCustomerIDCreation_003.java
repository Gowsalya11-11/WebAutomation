package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import DemoProject.pageObjects.TelecomPayment;
import org.openqa.selenium.WebElement;

public class TestNewTelecomCustomerIDCreation_003 extends BaseClass {
    @Test
    public void accountCreation() throws InterruptedException {
        driver.get(baseURL);


        TelecomPayment customerID = new TelecomPayment(driver);
        customerID.setTelecomProjectMenuLink();
        Thread.sleep(9000);
//        customerID.setAddCustomerLink();
//        customerID.setSelectbackgroundCheck();
        customerID.setTextCustomerFirstName("abc");
        customerID.setTextCustomerLastName("abc");
        customerID.setTextCustomerEmailId("abc@abc.com");
        customerID.setTextCustomerAddress("abc");
        customerID.setTextCustomerPhoneNumber("12345");
        customerID.clickSubmit();
        Thread.sleep(5000);

        WebElement cellElement = driver.findElement(By.xpath("//table[@class=\"alt access\"]//td[2]"));
        String actualCellXpath = cellElement.getText();

        System.out.println("CustomerId generates is : " + actualCellXpath);

    }
}
