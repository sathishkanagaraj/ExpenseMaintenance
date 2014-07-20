package com.springapp.mvc.service;

import com.springapp.mvc.data.repo.ExpenseRepository;
import com.springapp.mvc.model.Expense;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 14/7/14
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Resource
    private ExpenseRepository expenseRepository;

    @Override
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public Expense getExpenseByCategory(String category) {
        return null;
    }
}
