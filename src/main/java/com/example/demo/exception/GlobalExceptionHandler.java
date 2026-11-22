package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Map<String, Object> handleException(Exception e) {
        e.printStackTrace();

        Map<String, Object> result = new HashMap<>();
        result.put("code", 500);
        result.put("msg", "系统开小差了，请联系管理员：" + e.getMessage());
        result.put("data", null);

        return result;
    }
}
