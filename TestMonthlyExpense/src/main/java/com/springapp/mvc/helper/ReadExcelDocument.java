package com.springapp.mvc.helper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 27/8/14
 * Time: 8:37 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ReadExcelDocument {

    private LinkedList<Object> linkedList = new LinkedList<Object>();

    public List<ProductBuilder> readExcelDocumentAndBuildProducts(File file) throws IOException {
        final FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = xssfWorkbook.getSheet("August");
        return buildProductAndItsAttributes(sheet);
    }

    private List<ProductBuilder> buildProductAndItsAttributes(final XSSFSheet sheet) {
        List<ProductBuilder> productBuilders = new ArrayList<ProductBuilder>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            XSSFRow row = sheet.getRow(i);
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        linkedList.add(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        linkedList.add(cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        double numericValueFromFormula = cell.getNumericCellValue();
                        linkedList.add(numericValueFromFormula);
                        break;
                }

            }
            final String brand = (String) linkedList.get(0);
            final String name = (String) linkedList.get(1);
            final BigDecimal unitPrice = BigDecimal.valueOf((Double) linkedList.get(2));
            final int quantity = ((Double) linkedList.get(3)).intValue();
            final BigDecimal amount = BigDecimal.valueOf((Double) linkedList.get(4));
            final String type = (String) linkedList.get(5);
            final String month = (String) linkedList.get(6);
            ProductBuilder productBuilder = new ProductBuilder.Builder(name, brand, unitPrice, quantity, amount, type, month).build();
            productBuilders.add(productBuilder);
            linkedList = new LinkedList<Object>();
        }
        System.out.print("buildProduct = " + productBuilders);
        return productBuilders;
    }
}
