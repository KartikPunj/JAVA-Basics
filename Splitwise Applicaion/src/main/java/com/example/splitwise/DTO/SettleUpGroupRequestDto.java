package com.example.splitwise.DTO;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.IdGeneratorType;

@Getter
@Setter
public class SettleUpGroupRequestDto {

    private Long groupId;
}
