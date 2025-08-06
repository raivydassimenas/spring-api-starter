package com.codewithmosh.store.dtos;

import java.math.BigDecimal;

public class UpdateProductRequest {
    String name;
    String description;
    Byte categoryId;
    BigDecimal price;
}
