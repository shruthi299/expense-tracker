package com.expense.controller;

import com.expense.model.Expense;
import com.expense.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    // GET ALL EXPENSES
    @GetMapping
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    // ADD EXPENSE
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return repository.save(expense);
    }
}
