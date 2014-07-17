package com.springapp.mvc.business.businessobject.adaptor;

import com.springapp.mvc.model.Product;
import com.springapp.mvc.web.view.viewobject.ProductView;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 21/5/14
 * Time: 9:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ProductBusinessAdaptor {

    /**
     * Adapt Product View
     *
     * @param productView productView
     * @return product
     */
    public Product adapt(ProductView productView) {
        final Product product = new Product();
        product.setId(productView.getId());
        product.setName(productView.getName());
        product.setBrand(productView.getBrand());
        product.setQuantity(productView.getQuantity());
        product.setPrice(productView.getPrice());
        return product;
    }
}
