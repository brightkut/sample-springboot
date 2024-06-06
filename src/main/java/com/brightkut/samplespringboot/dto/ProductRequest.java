package com.brightkut.samplespringboot.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductRequest {
    @NotNull // ใช้ annotation เพื่อ validate ห้าม null
    private String name;
    @NotNull
    @Positive // ใช้ annotation เพื่อ validate ราคาต้องมากกว่า 0
    private Integer price;
}
