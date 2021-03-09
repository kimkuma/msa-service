package com.kuma04.msa.spring.repository.jpa;

import org.springframework.data.repository.CrudRepository;

public interface ICoffeeOrderJpaRepository extends CrudRepository<OrderEntityJPO, String> {
}
