package com.example.splitwise.DTO;

import com.example.splitwise.models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class SettleUpGroupResponseDto {
       private List<Expense> expenses;
}
