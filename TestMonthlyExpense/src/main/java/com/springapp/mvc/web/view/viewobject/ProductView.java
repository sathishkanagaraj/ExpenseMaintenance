package com.springapp.mvc.web.view.viewobject;

import java.math.BigDecimal;

public class ProductView {

    private Long id;
    private String name;
    private String brand;
    private String quantity;
    private BigDecimal rate;
    private BigDecimal price;
    private ExpenseView expenseView;

    public ExpenseView getExpenseView() {
        return expenseView;
    }

    public void setExpenseView(ExpenseView expenseView) {
        this.expenseView = expenseView;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
