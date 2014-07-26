package com.springapp.mvc.web.view.viewobject;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 16/5/14
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExpenseView {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date expenseDate;
    private List<ProductView> products = new ArrayList<ProductView>();
    private BigDecimal totalExpense;


    public BigDecimal getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(BigDecimal totalExpense) {
        this.totalExpense = totalExpense;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public List<ProductView> getProducts() {
        return products;
    }

    public void setProducts(List<ProductView> products) {
        this.products = products;
    }
}
