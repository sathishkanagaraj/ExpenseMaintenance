package com.springapp.mvc.web.controller;

import com.springapp.mvc.business.businessobject.adaptor.ExpenseBusinessAdaptor;
import com.springapp.mvc.service.ExpenseService;
import com.springapp.mvc.service.ProductService;
import com.springapp.mvc.web.view.viewobject.ExpenseView;
import com.springapp.mvc.web.view.viewobject.ProductView;
import com.springapp.mvc.web.view.viewobject.adaptor.ProductViewAdaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 10/5/14
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping("/")
@Controller
public class ExpenseController {

    @Autowired
    private ExpenseBusinessAdaptor expenseBusinessAdaptor;

    @Autowired
    private ProductViewAdaptor productViewAdaptor;

    @Autowired
    private ProductService productService;

    @Autowired
    private ExpenseService expenseService;

    @RequestMapping({"/", "/expense"})
    public String getExpensePage(final ExpenseView expenseView, Model model) {
        expenseView.setExpenseDate(Calendar.getInstance().getTime());
        return "expenseTable";
    }

    @RequestMapping(value = "/expense", params = {"addRow"})
    public String addRow(final ExpenseView expenseView, final BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("inputError", "Input is InCorrect");
            return "expenseTable";
        }
        expenseView.getProducts().add(new ProductView());
        return "expenseTable";
    }

    @RequestMapping(value = "/expense", params = {"removeRow"})
    public String removeRow(final ExpenseView expenseView, final BindingResult bindingResult, final HttpServletRequest req) {
        final Integer rowId = Integer.valueOf(req.getParameter("removeRow"));
        expenseView.getProducts().remove(rowId.intValue());
        return "expenseTable";
    }

    @RequestMapping(value = "/expense", params = {"saveProducts"})
    public String saveProducts(final ExpenseView expenseView, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("err", "Input is InCorrect");
            return "expenseTable";
        }
        // productService.saveProducts(expenseBusinessAdaptor.adapt(expenseView).getProducts());
        expenseService.saveExpense(expenseBusinessAdaptor.adapt(expenseView));
        return "expenseTable";
    }

    @RequestMapping(value = "/expense", params = {"retrieveProducts"})
    public String retrieveProducts(final ExpenseView expenseView) {
        expenseView.setExpenseDate(Calendar.getInstance().getTime());
        List<ProductView> productViews = productViewAdaptor.adapt(productService.retrieveProducts());
        expenseView.setProducts(productViews);
        expenseView.setTotalExpense(getTotalExpense(productViews));
        return "expenseTable";
    }

    private BigDecimal getTotalExpense(List<ProductView> productViews) {
        BigDecimal expenseInTotal = BigDecimal.ZERO;
        for (ProductView productView : productViews) {
            BigDecimal priceInBigDecimal = productView.getPrice();
            expenseInTotal = expenseInTotal.add(priceInBigDecimal);
        }
        System.out.println(expenseInTotal);
        return expenseInTotal;
    }

}
