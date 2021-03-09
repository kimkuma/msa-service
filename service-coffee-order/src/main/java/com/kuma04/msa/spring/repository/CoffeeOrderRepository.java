package com.kuma04.msa.spring.repository;

import com.kuma04.msa.domain.model.OrderEntity;
import com.kuma04.msa.domain.repository.ICoffeeOrderRepository;
import com.kuma04.msa.spring.repository.jpa.ICoffeeOrderJpaRepository;
import com.kuma04.msa.spring.repository.jpa.OrderEntityJPO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CoffeeOrderRepository implements ICoffeeOrderRepository {

    private final ICoffeeOrderJpaRepository iCoffeeOrderJpaRepository;

    @Override
    public String coffeeOrderSave(OrderEntity orderEntity) {

        OrderEntityJPO orderEntityJPO = new OrderEntityJPO();
        orderEntityJPO.setOrderNumber(orderEntity.getOrderNumber());
        orderEntityJPO.setCoffeeName(orderEntity.getCoffeeName());
        orderEntityJPO.setCoffeeCount(orderEntity.getCoffeeCount());
        orderEntityJPO.setCustomerName(orderEntity.getCustomerName());

        iCoffeeOrderJpaRepository.save(orderEntityJPO);

        return orderEntityJPO.getId();
    }
}
