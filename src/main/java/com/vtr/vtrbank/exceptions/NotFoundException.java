package com.vtr.vtrbank.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String error){
        super(error);
    }

}
