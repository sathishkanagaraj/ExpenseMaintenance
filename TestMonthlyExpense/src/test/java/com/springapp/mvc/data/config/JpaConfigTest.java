package com.springapp.mvc.data.config;

import com.springapp.mvc.data.repo.ExpenseRepository;
import com.springapp.mvc.data.repo.ProductRepository;
import com.springapp.mvc.model.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 19/5/14
 * Time: 8:40 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaHsqlConfig.class})
public class JpaConfigTest {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ExpenseRepository expenseRepository;


    @Before
    public void setUp() throws Exception {
        /*expenseRepository.save(new Expense());*/
        productRepository.save(new Product(1L, "ProductName", "ProductBrand", "1", BigDecimal.ONE, BigDecimal.TEN));

    }

    @Test
    public void testProductRepositoryNotNull() throws Exception {
        assertNotNull(productRepository);

    }

    @Test
    public void testProductName() throws Exception {
        assertEquals("ProductName", productRepository.findAll().get(0).getName());

    }
}
