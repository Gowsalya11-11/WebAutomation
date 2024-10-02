package DemoProject.test;

import DemoProject.pageObjects.PaymentGateWayPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import DemoProject.utlitities.ReadingTestData;

import java.math.BigDecimal;


public class TestPaymentGateWay_002 extends BaseClass{

    @Test(dataProvider = "paymentData", dataProviderClass = ReadingTestData.class)
    public void paymentGateWay(String cardNumber, String expirationMonth, String expirationYear, String cvvCodeValue) throws InterruptedException {
        driver.get(baseURL);
        PaymentGateWayPage paymentgatewaypage = new PaymentGateWayPage(driver);

        paymentgatewaypage.setPaymentGatewayProjectMenuLink();
        paymentgatewaypage.setSelectQuantityDropDown(quantityToPurchase);
        paymentgatewaypage.setButtonBuyNow();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(cardNumber));
        cardNumber = bigDecimal.toPlainString();
        paymentgatewaypage.setTextEnterCardNumber(cardNumber);
        String formatedMonth = convertDoubleToString(expirationMonth);
        paymentgatewaypage.setSelectExpirationMonth(formatedMonth);
        String formatedYear = convertDoubleToString(expirationYear);
        paymentgatewaypage.setSelectExpirationYear(formatedYear);
        cvvCodeValue = String.valueOf(cvvCodeValue);
        paymentgatewaypage.setTextEnterCVVCodeNumber(cvvCodeValue);
        paymentgatewaypage.setButtonClickPayNow();

        Thread.sleep(5000);
        if (driver.findElement(By.xpath("//*[contains(text(),'Payment successfull')]")).getText().equals("Payment successfull!")) {

            Assert.assertTrue(true);
        } else
            Assert.fail();


    }

    public static String convertDoubleToString(String value) {
        double formatedDoubleValue = Double.parseDouble(String.valueOf(value));
        int intValue = (int) formatedDoubleValue;
        return Integer.toString(intValue);
    }
}
