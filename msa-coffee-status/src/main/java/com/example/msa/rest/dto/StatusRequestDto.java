package com.example.msa.rest.dto;

import com.example.msa.repository.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StatusRequestDto {
    private String orderHistory;

    @Builder
    public StatusRequestDto(String orderHistory){
        this.orderHistory = orderHistory;
    }

    public Status toEntity(){
        return Status.builder()
                .orderHistory(orderHistory).build();
    }
}
