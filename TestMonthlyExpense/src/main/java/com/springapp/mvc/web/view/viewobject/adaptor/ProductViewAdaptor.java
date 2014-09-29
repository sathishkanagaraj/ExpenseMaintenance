package com.springapp.mvc.web.view.viewobject.adaptor;

import com.springapp.mvc.model.Product;
import com.springapp.mvc.web.view.viewobject.ProductView;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 169345 on 5/22/2014.
 */
@Component
public class ProductViewAdaptor {

    /**
     * @param products
     * @return
     */
    public List<ProductView> adapt(List<Product> products) {
        final List<ProductView> productViews = new ArrayList<ProductView>();
        ProductView productView;
        for (Product product : products) {
            productView = new ProductView();
            productView.setId(product.getId());
            productView.setName(product.getName());
            productView.setBrand(product.getBrand());
            productView.setQuantity(product.getQuantity());
            productView.setPrice(product.getPrice());
            productView.setCategory(product.getCategory());
            productView.setRate(product.getRate());
            productViews.add(productView);
        }
        return productViews;
    }
}
