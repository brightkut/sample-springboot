package com.brightkut.samplespringboot.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;


// สร้าง custom exception ขึ้นมาใช้ได้
@EqualsAndHashCode(callSuper = true) // เนื่องจากมีการ extend มาจึงต้องใส่
@Data
public class NotImplementException extends RuntimeException{
    private final String message;
}
