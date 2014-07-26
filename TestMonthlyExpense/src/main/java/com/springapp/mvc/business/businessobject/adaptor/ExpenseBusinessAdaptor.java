package com.springapp.mvc.business.businessobject.adaptor;

import com.springapp.mvc.model.Expense;
import com.springapp.mvc.model.Product;
import com.springapp.mvc.web.view.viewobject.ExpenseView;
import com.springapp.mvc.web.view.viewobject.ProductView;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
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
        expense.setProducts(getProducts(expenseView, expense));
        expense.setTotalExpense(getTotalExpense(expenseView.getProducts()));
        return expense;
    }

    private BigDecimal getTotalExpense(List<ProductView> productViews) {
        BigDecimal expenseInTotal = BigDecimal.ZERO;
        for (ProductView productView : productViews) {
            BigDecimal priceInBigDecimal = productView.getPrice();
            expenseInTotal = expenseInTotal.add(priceInBigDecimal);
        }
        System.out.println(expenseInTotal);
        return expenseInTotal;
    }

    private List<Product> getProducts(ExpenseView expenseView, Expense expense) {
        final List<Product> productList = new ArrayList<Product>();
        Product product;
        for (ProductView productView : expenseView.getProducts()) {
            product = new Product();
            product.setId(productView.getId());
            product.setName(productView.getName());
            product.setBrand(productView.getBrand());
            product.setQuantity(productView.getQuantity());
            product.setPrice(productView.getPrice());
            product.setRate(productView.getRate());
            product.setCategory(productView.getCategory());
            product.setExpense(expense);
            productList.add(product);
        }
        return productList;
    }
}
