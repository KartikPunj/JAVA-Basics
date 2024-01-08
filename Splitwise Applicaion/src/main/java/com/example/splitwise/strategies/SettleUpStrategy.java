package com.example.splitwise.strategies;

import com.example.splitwise.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    public List<Expense> settleUp(List<Expense> expenseList);
}
