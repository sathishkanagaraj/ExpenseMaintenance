package com.springapp.mvc.business.businessobject.adaptor;

import com.springapp.mvc.model.Expense;
import com.springapp.mvc.model.Product;
import com.springapp.mvc.web.view.viewobject.ExpenseView;
import com.springapp.mvc.web.view.viewobject.ProductView;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 21/5/14
 * Time: 9:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ExpenseBusinessAdaptor {
    /**
     * Adapt Expense from ExpenseView
     *
     * @param expenseView expenseView
     * @return expense
     */
    public Expense adapt(ExpenseView expenseView) {
        final Expense expense = new Expense();
        expense.setExpenseDate(expenseView.getExpenseDate());
        expense.setProducts(getProducts(expenseView));
        return expense;
    }

    private List<Product> getProducts(ExpenseView expenseView) {
        final List<Product> productList = new ArrayList<Product>();
        Product product;
        for (ProductView productView : expenseView.getProducts()) {
            product = new Product();
            product.setId(productView.getId());
            product.setName(productView.getName());
            product.setBrand(productView.getBrand());
            product.setQuantity(productView.getQuantity());
            product.setPrice(productView.getPrice());
            //product.setExpenseDate(expenseView.getExpenseDate());
            productList.add(product);
        }
        return productList;
    }
}
