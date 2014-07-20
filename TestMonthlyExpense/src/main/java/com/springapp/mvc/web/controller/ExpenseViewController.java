package com.springapp.mvc.web.controller;

import com.springapp.mvc.model.Product;
import com.springapp.mvc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 20/7/14
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping("/view")
@Controller
public class ExpenseViewController {

    @Resource
    private ProductService productService;

    @RequestMapping("/expenseChart")
    public String getExpenseViewChart() {
        return "expenseView";
    }

    @RequestMapping("/expense")
    public ModelAndView getProductsBasedOnCategory(@RequestParam("category") String category) {
        System.out.println("Category   " + category);
        ModelAndView modelAndView = new ModelAndView("expenseView");
        List<Product> productsByCategory = productService.getProductsByCategory(category);
        modelAndView.addObject("products", productsByCategory);
        return modelAndView;
    }
}
