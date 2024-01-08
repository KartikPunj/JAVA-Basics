package com.example.splitwise.repositories;

import com.example.splitwise.models.Expense;
import com.example.splitwise.models.ExpenseUser;
import com.example.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ExpenseUserRepository extends JpaRepository<ExpenseUser,Long> {

 List<ExpenseUser>findByUser(User user);// will fetch all expenses of all user

}
