package DemoProject.utlitities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingTestData {

    public static String cardNumber;
    public static String expirationMonth;
    public static String expirationYear;
    public static String cvvCode;

    @DataProvider(name = "paymentData")
    public static Object[][] provideData() throws IOException {
        //To get the path of data file
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
                }
            }
        }
        return data;
    }
}