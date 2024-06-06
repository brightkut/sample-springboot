package com.brightkut.samplespringboot.handler;

import com.brightkut.samplespringboot.exception.NotImplementException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // เป็น level นอกสุดที่จะดักจับ exception เราสามารถ custom response เพื่อส่งออกไปให้ user ได้
    @ExceptionHandler(NotImplementException.class)
    public ResponseEntity<String> handleException(Exception ex, HttpServletRequest request) {
        return ResponseEntity
                .internalServerError()
                .body("Some part of code did not implement");
    }
}
