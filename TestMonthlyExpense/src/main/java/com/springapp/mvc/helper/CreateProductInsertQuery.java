package com.springapp.mvc.helper;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 27/8/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */

public class CreateProductInsertQuery {

    final private ReadExcelDocument readExcelDocument = new ReadExcelDocument();
    private File file;
    private DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
    private int lastRowIndex = 447;

    public CreateProductInsertQuery(File file) {
        this.file = file;
    }

    public void create() throws IOException {
        final StringBuilder stringBuilder = new StringBuilder();
        List<ProductBuilder> productBuilders = readExcelDocument.readExcelDocumentAndBuildProducts(file);
        for (ProductBuilder productBuilder : productBuilders) {
            stringBuilder.append("INSERT INTO product_details (id, brand, name, price, quantity, rate, expense_date, category, month) VALUES (");
            lastRowIndex += 1;
            stringBuilder.append(lastRowIndex + ", '");
            stringBuilder.append(productBuilder.getBrand() + "', '");
            stringBuilder.append(productBuilder.getName() + "', ");
            stringBuilder.append(productBuilder.getAmount() + ", ");
            stringBuilder.append(productBuilder.getQuantity() + ", ");
            stringBuilder.append(productBuilder.getUnitPrice() + ", '");
            stringBuilder.append(dateTimeFormatter.parseDateTime("2014-12-15") + "', '");
            stringBuilder.append(productBuilder.getType() + "', '");
            stringBuilder.append(productBuilder.getMonth() + "');");
            stringBuilder.append("\n");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\sathih\\Documents\\GitHub\\MyGitRepo\\TestMonthlyExpense\\src\\main\\resources\\sql-script\\insert-products-purchased.sql"));
        fileOutputStream.write(stringBuilder.toString().getBytes());
        fileOutputStream.close();
    }
}
