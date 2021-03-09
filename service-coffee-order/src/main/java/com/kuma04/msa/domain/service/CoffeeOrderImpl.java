package com.kuma04.msa.domain.service;

import com.kuma04.msa.domain.model.CoffeeOrderVO;
import com.kuma04.msa.domain.model.OrderEntity;
import com.kuma04.msa.domain.repository.CoffeeOrderRepository;

public class CoffeeOrderImpl implements CoffeeOrder{

    private CoffeeOrderRepository coffeeOrderRepository;

    public CoffeeOrderImpl(CoffeeOrderRepository coffeeOrderRepository) {
        this.coffeeOrderRepository = coffeeOrderRepository;
    }

    @Override
    public String coffeeOrder(CoffeeOrderVO coffeeOrderVO) {

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderNumber(coffeeOrderVO.getOrderNumber());
        orderEntity.setCoffeeName(coffeeOrderVO.getCoffeeName());
        orderEntity.setCustomerName(coffeeOrderVO.getCustomerName());
        orderEntity.setCoffeeCount(coffeeOrderVO.getCoffeeCount());

        coffeeOrderRepository.coffeeOrderSave(orderEntity);

        return orderEntity.getId();
    }
}
