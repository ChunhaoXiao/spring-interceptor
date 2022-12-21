package com.example.interceptor;

public class InvalidHeaderFieldException extends Exception{
    public  InvalidHeaderFieldException(String msg) {
        super(msg);
    }
}
