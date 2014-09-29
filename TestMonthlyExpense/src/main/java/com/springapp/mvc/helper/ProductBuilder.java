package com.springapp.mvc.helper;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 27/8/14
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductBuilder {

    private String name;
    private String brand;
    private BigDecimal unitPrice;
    private int quantity;
    private BigDecimal amount;
    private String type;
    private String month;

    private ProductBuilder(String name, String brand, BigDecimal unitPrice, int quantity, BigDecimal amount, String type, String month) {
        this.name = name;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.amount = amount;
        this.type = type;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getMonth() {
        return month;
    }

    static class Builder {
        private String name;
        private String brand;
        private BigDecimal unitPrice;
        private int quantity;
        private BigDecimal amount;
        private String type;
        private String month;

        Builder(String name, String brand, BigDecimal unitPrice, int quantity, BigDecimal amount, String type, String month) {
            this.name = name;
            this.brand = brand;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
            this.amount = amount;
            this.type = type;
            this.month = month;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBrand() {
            return brand;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public BigDecimal getUnitPrice() {
            return unitPrice;
        }

        public Builder setUnitPrice(BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public int getQuantity() {
            return quantity;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public Builder setAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public String getType() {
            return type;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public String getMonth() {
            return month;
        }

        public Builder setMonth(String month) {
            this.month = month;
            return this;
        }

        public ProductBuilder build() {
            return new ProductBuilder(getName(), getBrand(), getUnitPrice(), getQuantity(), getAmount(), getType(), getMonth());
        }

    }

    @Override
    public String toString() {
        return "ProductBuilder{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}
