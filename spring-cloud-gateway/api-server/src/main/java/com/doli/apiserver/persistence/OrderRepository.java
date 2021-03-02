package com.doli.apiserver.persistence;

import com.doli.apiserver.entity.Order;
import org.springframework.data.querydsl.ReactiveQuerydslPredicateExecutor;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface OrderRepository extends R2dbcRepository<Order,Long> {

}
