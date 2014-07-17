package com.springapp.mvc.data.repo;

import com.springapp.mvc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 18/5/14
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
