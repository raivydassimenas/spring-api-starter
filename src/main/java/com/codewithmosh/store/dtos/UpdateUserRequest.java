package com.codewithmosh.store.dtos;

import lombok.Data;

@Data
public class UpdateUserRequest {
    String name;
    String email;
}
