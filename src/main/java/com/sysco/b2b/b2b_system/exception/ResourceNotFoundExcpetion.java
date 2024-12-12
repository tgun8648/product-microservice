package com.sysco.b2b.b2b_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcpetion extends RuntimeException{

    public ResourceNotFoundExcpetion(String message){
        super(message);
    }

}






















//more exceptions
//data access, connection
//document - include the excpetions on swagger as well
//handle the excpetions in the controller
//user friendly error handleing

