package com.example.splitwise.services;

import com.example.splitwise.models.Expense;
import com.example.splitwise.models.ExpenseUser;
import com.example.splitwise.models.Group;
import com.example.splitwise.models.User;
import com.example.splitwise.repositories.ExpenseRepository;
import com.example.splitwise.repositories.ExpenseUserRepository;
import com.example.splitwise.repositories.GroupRepository;
import com.example.splitwise.repositories.UserRepository;
import com.example.splitwise.strategies.SettleUpStrategy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
@Getter
@Setter
@Service
public class SettleUpService {

    private GroupRepository groupRepository;
    private UserRepository userRepository;
    private ExpenseRepository expenseRepository;
    private ExpenseUserRepository expenseUserRepository;
    private SettleUpStrategy settleUpStrategy;

    @Autowired
    public SettleUpService(GroupRepository groupRepository, UserRepository userRepository, ExpenseRepository expenseRepository, ExpenseUserRepository expenseUserRepository, SettleUpStrategy settleUpStrategy) {
        this.groupRepository = groupRepository;
        this.userRepository = userRepository;
        this.expenseRepository = expenseRepository;
        this.expenseUserRepository = expenseUserRepository;
        this.settleUpStrategy = settleUpStrategy;
    }

    public List<Expense> settleUpUser(Long userId){
        //get the user from user repo
        //get all the expenses for a particular user
        //Settle up the expenses using a settling up strategy
        // return expensesTo settleup
        // 1. Get the user from repo
        Optional<User> optionalUser = userRepository.findById(userId);

        if(optionalUser.isEmpty())
            throw new RuntimeException();

        User user = optionalUser.get();

        // 2. get the expenses for a particular user
        List<ExpenseUser> expenseUserList = expenseUserRepository.findByUser(user);

        Set<Expense> expenseSet = new HashSet<>();
        for(ExpenseUser expenseUser:expenseUserList){
            expenseSet.add(expenseUser.getExpense());
        }
        // 3. Settle up the expenses using a settling up strategy
        List<Expense> expenseToSettle = settleUpStrategy.settleUp(expenseSet.stream().toList());

        // 4. return expensesTo settleup for this particular user from list of all user expenses
        // I need to add List<ExpenseUser> to Expense class so that
        // I can filter out the expenses where this user is involved
        List<Expense> expensesToReturn = new ArrayList<>();
        for(Expense expense:expenseToSettle){
            for(ExpenseUser expenseUser:expense.getExpenseUserList()){
                if(expenseUser.getUser().equals(user));
                expensesToReturn.add(expense);
                break;
            }
        }


        return expensesToReturn;
    }

    public List<Expense> settleUpGroup(Long groupId){




        // 1. validate the group by getting the group from repository
        // 2. get the expenses for a particular group
        // 3. Settle up the expenses using a settling up strategy
        // 4. return expensesTo settleup

        // 1. Get the group from repo
        Optional<Group> optionalGroup = groupRepository.findById(groupId);

        if(optionalGroup.isEmpty())
            throw new RuntimeException();

        Group group = optionalGroup.get();

        // 2. get the expenses for a particular group
        List<Expense> expenseList = expenseRepository.findAllByGroup(group);

        // 3. Settle up the expenses using a settling up strategy
        List<Expense> expensesToReturn = settleUpStrategy.settleUp(expenseList);

        // 4. return expensesTo settleup
        return expensesToReturn;
    }
}
