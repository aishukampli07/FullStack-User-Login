package com.aishwarya.fullstack.exeception;

public class UserNOtFoundException extends RuntimeException{
    public  UserNOtFoundException(Long id){
        super("Could not find the user with the id " + id);
    }
}
