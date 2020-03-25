package com.example.msa.repository;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Order {

    private Long id;
    private int orderNO;
    private String coffeeName;
    private int coffeeCount;
    private String memberName;

    @Builder
    public Order(int orderNO, String coffeeName, int coffeeCount, String memberName) {
        this.orderNO = orderNO;
        this.coffeeName = coffeeName;
        this.coffeeCount = coffeeCount;
        this.memberName = memberName;
    }
}
