package com.kuma04.msa.spring.repository.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class OrderEntityJPO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    String orderNumber; // 주문번호
    String coffeeName; // 커피종류
    String coffeeCount; // 커피개수
    String customerName; //회원명

}
