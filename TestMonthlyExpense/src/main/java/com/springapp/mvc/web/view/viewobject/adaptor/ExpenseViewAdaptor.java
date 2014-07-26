package com.springapp.mvc.web.view.viewobject.adaptor;

import com.springapp.mvc.model.Expense;
import com.springapp.mvc.web.view.viewobject.ExpenseView;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by 169345 on 5/22/2014.
 */
@Component
public class ExpenseViewAdaptor {

    @Resource
    private ProductViewAdaptor productViewAdaptor;

    public ExpenseView adapt(Expense expense) {
        final ExpenseView expenseView = new ExpenseView();
        expenseView.setExpenseDate(expense.getExpenseDate());
        expenseView.setProducts(productViewAdaptor.adapt(expense.getProducts()));
        expenseView.setTotalExpense(expense.getTotalExpense());
        return expenseView;
    }
}
