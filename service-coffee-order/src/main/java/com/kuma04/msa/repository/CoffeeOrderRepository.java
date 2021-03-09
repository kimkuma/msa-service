package com.kuma04.msa.repository;

import com.kuma04.msa.domain.OrderEntity;

public interface CoffeeOrderRepository {
    String coffeeOrderSave(OrderEntity orderEntity);
}
