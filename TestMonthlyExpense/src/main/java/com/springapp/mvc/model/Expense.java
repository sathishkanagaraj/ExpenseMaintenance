package com.springapp.mvc.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 10/5/14
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "EXPENSE_REG")
public class Expense {

    @Id
    @Column(name = "expense_date")
    private Date expenseDate;
    @OneToMany(mappedBy = "expense", cascade = CascadeType.ALL)
    private List<Product> products;
    @Column(name = "total_expense")
    private BigDecimal totalExpense;

    public Expense(Date expenseDate, List<Product> products, BigDecimal totalExpense) {
        this.expenseDate = expenseDate;
        this.products = products;
        this.totalExpense = totalExpense;
    }

    public Expense() {
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

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

    public List<Product> getProducts() {
        return this.products;
    }

}
