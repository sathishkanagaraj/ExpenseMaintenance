package com.springapp.mvc.web.controller;

import com.springapp.mvc.model.Expense;
import com.springapp.mvc.model.Product;
import com.springapp.mvc.service.ExpenseService;
import com.springapp.mvc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
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

    @Resource
    private ExpenseService expenseService;

    @RequestMapping("/expenseChart")
    public String getExpenseViewChart() {
        return "expenseView";
    }

    @RequestMapping("/expense")
    public ModelAndView getProductsBasedOnCategory(@RequestParam("category") String category) {
        System.out.println("Category   " + category);
        ModelAndView modelAndView = new ModelAndView("expenseView");
        List<Product> productsByCategory = productService.getProductsByCategory(category);
        modelAndView.addObject("expenseDate", productsByCategory.get(0).getExpense().getExpenseDate());
        modelAndView.addObject("products", productsByCategory);
        return modelAndView;
    }

    @RequestMapping("/expenseMonth")
    public ModelAndView getExpenseBasedOnMonth(@RequestParam("expenseMonth") String month) throws ParseException {

        ModelAndView modelAndView = new ModelAndView("expenseView");
        List<Product> productsOnMonth = productService.getProductsByMonth(month);
        modelAndView.addObject("products", productsOnMonth);
        modelAndView.addObject("month", month);
        return modelAndView;
    }

    @RequestMapping("allExpenses")
    public ModelAndView getAllExpenses() {
        List<Product> allProducts = new ArrayList<Product>();
        ModelAndView modelAndView = new ModelAndView("expenseView");
        List<Expense> expenses = expenseService.getAllExpenses();
        for (Expense expense : expenses) {
            allProducts.addAll(expense.getProducts());
        }
        modelAndView.addObject("products", allProducts);
        return modelAndView;
    }
}
