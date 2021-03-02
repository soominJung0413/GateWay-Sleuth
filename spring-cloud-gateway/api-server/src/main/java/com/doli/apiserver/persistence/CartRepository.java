package com.doli.apiserver.persistence;

import com.doli.apiserver.entity.Cart;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface CartRepository extends R2dbcRepository<Cart, Long> {
    Mono<Cart> findByProductId(Integer product_id);

    Mono<Cart> findById(Long id);
}
