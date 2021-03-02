package com.doli.apiserver.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("cart")
@Getter @Setter
public class Cart {

    @Id
    private Long id;
    @Column("product_id")
    private Integer productId;
}
