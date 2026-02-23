package com.example.TaskStudent.Exception;

public class UnauthorizedException extends  RuntimeException{

    public  UnauthorizedException(String message){
           super(message);
    }
}
