package com.kuma04.msa.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CoffeeOrderVO {
    private String id;
    private String orderNumber; // 주문번호
    private String coffeeName; // 커피종류
    private String coffeeCount; // 커피개수
    private String customerName; // 회원명
}
