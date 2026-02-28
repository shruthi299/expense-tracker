package com.expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.model.Expense;
import com.expense.repository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public void saveExpense(Expense expense) {
        repository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }
}
