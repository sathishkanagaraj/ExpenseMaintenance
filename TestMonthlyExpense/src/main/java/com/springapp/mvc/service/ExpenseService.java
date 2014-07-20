package com.springapp.mvc.service;

import com.springapp.mvc.model.Expense;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 14/7/14
 * Time: 9:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ExpenseService {

    void saveExpense(Expense expense);

    Expense getExpenseByCategory(String category);

}
