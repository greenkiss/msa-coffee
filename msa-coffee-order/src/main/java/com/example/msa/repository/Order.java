package com.example.msa.repository;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Order {

    private Long id;
    private int orderNo;
    private String coffeeName;
    private int coffeeCount;
    private String memberName;

    @Builder
    public Order(int orderNo, String coffeeName, int coffeeCount, String memberName) {
        this.orderNo = orderNo;
        this.coffeeName = coffeeName;
        this.coffeeCount = coffeeCount;
        this.memberName = memberName;
    }
}
