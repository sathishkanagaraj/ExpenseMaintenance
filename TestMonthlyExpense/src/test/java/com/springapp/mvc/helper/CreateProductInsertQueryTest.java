package com.springapp.mvc.helper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 27/8/14
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateProductInsertQueryTest {

    private static File file;

    @BeforeClass
    public static void beforeClass() {
        file = new File("C:\\Users\\sathih\\Documents\\GitHub\\MyGitRepo\\TestMonthlyExpense\\src\\main\\resources\\HouseExpenseChart.xlsx");
    }

    private CreateProductInsertQuery createProductInsertQuery = new CreateProductInsertQuery(file);

    @Test
    public void testCreate() throws Exception {
        createProductInsertQuery.create();
        File actual = new File("C:\\Users\\sathih\\Documents\\GitHub\\MyGitRepo\\TestMonthlyExpense\\src\\main\\resources\\sql-script\\insert-products-purchased.sql");
        assertEquals(734320775168L, actual.getTotalSpace());
    }

}
