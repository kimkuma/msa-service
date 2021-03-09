package com.kuma04.msa.domain.repository;

import com.kuma04.msa.domain.model.OrderEntity;

public interface ICoffeeOrderRepository {
    String coffeeOrderSave(OrderEntity orderEntity);
}
