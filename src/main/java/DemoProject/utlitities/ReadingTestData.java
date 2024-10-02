package DemoProject.utlitities;
import DemoProject.test.BaseClass;
import org.apache.poi.hpsf.Decimal;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.text.DecimalFormat;

public class ReadingTestData {

    public static String cardNumber;
    public static String expirationMonth;
    public static String expirationYear;
    public static String cvvCode;

    @DataProvider(name = "paymentData")
    public static Object[][] provideData() throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\TestData\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("PaymentDetails");
        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(1).getLastCellNum();
        String[][] data = new String[totalRows][totalCells];
        if ((totalRows != 0) && (totalCells != 0)) {
            for (int i = 0; i < totalRows; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < totalCells; j++) {
                    Cell cell = row.getCell(j);
                     if (cell.getCellType() == CellType.NUMERIC) {
                        // Handle numeric cell
                        double numericValue = cell.getNumericCellValue();
                        String stringValue = Double.toString(numericValue);
                        data[i][j] = stringValue;
                    } else {
                        // Handle other cell types (string, etc.)
                        data[i][j] = cell.getStringCellValue().trim();
                    }
//                    XSSFCell cellValue = sheet.getRow(1).getCell(0);
//            BigDecimal bigDecimal = new BigDecimal(String.valueOf(cellValue));
//            cardNumber = bigDecimal.toPlainString();
//            cellValue = sheet.getRow(1).getCell(1);
//            expirationMonth = String.valueOf(cellValue);
//            System.out.println("" + expirationMonth);
//            cellValue = sheet.getRow(1).getCell(2);
//            double yearValue = Double.parseDouble(String.valueOf(cellValue));
//            int yearInt = (int) yearValue;
//            expirationYear = String.valueOf(yearInt);
//            System.out.println("" + expirationYear);
//            cellValue = sheet.getRow(1).getCell(3);
//            double cvvCodeValue = Double.parseDouble(String.valueOf(cellValue));
//            int cvvCodeInt = (int) cvvCodeValue;
//            cvvCode = String.valueOf(cvvCodeInt);
//            System.out.println("" + cvvCode);

                }
            }
        }
        return data;
    }
}