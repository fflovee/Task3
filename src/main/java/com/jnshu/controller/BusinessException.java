package com.jnshu.controller;

public class BusinessException extends RuntimeException {
    public BusinessException(String msg){
        super(msg);
    }
}
