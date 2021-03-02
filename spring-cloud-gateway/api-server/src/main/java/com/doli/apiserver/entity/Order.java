package com.doli.apiserver.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
@Getter @Setter
public class Order {

    @Id
    Long id;

    Integer product_id;

    Integer order_id;
}
