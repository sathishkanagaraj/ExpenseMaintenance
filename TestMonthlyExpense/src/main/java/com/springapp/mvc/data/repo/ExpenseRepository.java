package com.springapp.mvc.data.repo;

import com.springapp.mvc.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 13/7/14
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
