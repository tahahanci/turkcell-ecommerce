package com.tahahanci.turkcell_ecommerce.core.exception.types;

public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}