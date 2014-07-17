package com.springapp.mvc.service;

import com.springapp.mvc.data.repo.ProductRepository;
import com.springapp.mvc.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 18/5/14
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductRepository productRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveProducts(List<Product> products) {
        productRepository.save(products);

    }

    @Override
    public List<Product> retrieveProducts() {
        return productRepository.findAll();
    }
}
