package com.doli.apiserver.controller;

import com.doli.apiserver.entity.Cart;
import com.doli.apiserver.entity.Order;
import com.doli.apiserver.persistence.CartRepository;
import com.doli.apiserver.persistence.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class APIController {
    @Autowired
    private OrderRepository repository;
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/orders/{id}")
    public Mono<Order> getOrders(@PathVariable(value = "id") Long id) {
        log.debug("Check Sleuth");
        return repository.findById(id).log();
    }


    @GetMapping("/carts/{id}")
    public Mono<Cart> getCart(@PathVariable(value = "id") Long id) throws InterruptedException {
        Thread.sleep(11000);

        return cartRepository.findById(id).log();
    }
}




