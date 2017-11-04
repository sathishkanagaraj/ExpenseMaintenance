package com.springapp.mvc.helper;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 27/8/14
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateProductInsertQueryTest {

    private static File expense_data_file;
    private static String source_dir;
    private static String sql_data_filename;

    @BeforeClass
    public static void beforeClass() throws IOException {
        Properties properties = new Properties();
        final InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("loaddata.properties");
        properties.load(resourceAsStream);
        source_dir = properties.getProperty("source_dir");
        String file_name = properties.getProperty("expense-data_file_name");
        sql_data_filename = properties.getProperty("sql-data_file_name");
        expense_data_file = Paths.get(source_dir, file_name).toFile();
    }

    private CreateProductInsertQuery createProductInsertQuery = new CreateProductInsertQuery(expense_data_file);

    @Test
    public void testCreate() throws Exception {
        File actual = Paths.get(source_dir,sql_data_filename).toFile();
        createProductInsertQuery.create(actual);
        assertEquals(498887294976L, actual.getTotalSpace());
    }

}
