package com.karthik.fullstack.backend.execption;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not found the user with this id "+id);
    }

}
