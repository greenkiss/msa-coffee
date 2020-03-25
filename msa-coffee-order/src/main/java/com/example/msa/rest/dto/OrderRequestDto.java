package com.example.msa.rest.dto;

import com.example.msa.repository.Order;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderRequestDto {

    private int orderNo;
    private String coffeeName;
    private int coffeeCount;
    private String memberName;

    @Builder
    public OrderRequestDto(int orderNo, String coffeeName, int coffeeCount, String memberName) {
        this.orderNo = orderNo;
        this.coffeeName = coffeeName;
        this.coffeeCount = coffeeCount;
        this.memberName = memberName;
    }

    public Order toEntity(){
        return Order.builder()
                .orderNo(orderNo)
                .coffeeName(coffeeName)
                .coffeeCount(coffeeCount)
                .memberName(memberName).build();
    }
}
