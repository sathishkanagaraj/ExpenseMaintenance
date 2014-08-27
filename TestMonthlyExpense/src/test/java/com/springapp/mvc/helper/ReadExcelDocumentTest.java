package com.springapp.mvc.helper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 27/8/14
 * Time: 8:53 AM
 * To change this template use File | Settings | File Templates.
 */

public class ReadExcelDocumentTest {

    final private ReadExcelDocument readExcelDocument = new ReadExcelDocument();

    private static File file;

    @BeforeClass
    public static void beforeClass() {
        file = new File("C:\\Users\\sathih\\Documents\\GitHub\\MyGitRepo\\TestMonthlyExpense\\src\\main\\resources\\HouseExpenseChart.xlsx");
    }

    @Test
    public void testReadExcelDocument_for_no_of_rows_columns() throws Exception {
        List<ProductBuilder> productBuilders = readExcelDocument.readExcelDocumentAndBuildProducts(file);
        assertEquals(60, productBuilders.size());
       /* XSSFSheet sheet = xssfWorkbook.getSheet("August");
        int numberOfRows = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(sheet.getLastRowNum());
        assertEquals(61, numberOfRows);
        int numberOfColumns = row.getPhysicalNumberOfCells();
        assertEquals(7, numberOfColumns);*/
    }
}
