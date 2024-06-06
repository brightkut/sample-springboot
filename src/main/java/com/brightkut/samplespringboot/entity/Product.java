package com.brightkut.samplespringboot.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data // ไว้ generate getter , setter
@Accessors(chain = true) // ใช้เพื่อให้ setter return this ได้
public class Product {
    private String id;
    private String name;
    // ใช้ Integer แทน int เพราะป้องกันเรื่อง zero value
    private Integer price;
    private String type;
}
