package com.example.msa.rest.dto;

import com.example.msa.repository.Order;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderRequestDto {

    private String coffeeName;
    private int coffeeCount;
    private String memberName;

    @Builder
    public OrderRequestDto(String coffeeName, int coffeeCount, String memberName) {
        this.coffeeName = coffeeName;
        this.coffeeCount = coffeeCount;
        this.memberName = memberName;
    }

    public Order toEntity(){
        return Order.builder()
                .coffeeName(coffeeName)
                .coffeeCount(coffeeCount)
                .memberName(memberName).build();
    }
}
