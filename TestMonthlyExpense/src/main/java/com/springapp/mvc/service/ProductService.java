package com.springapp.mvc.service;

import com.springapp.mvc.model.Product;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 18/5/14
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductService {
    /**
     * add product
     *
     * @param product product
     */
    void saveProducts(List<Product> product);

    /**
     * retrieve all products
     *
     * @return list of products
     */
    List<Product> retrieveProducts();
}
