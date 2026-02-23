package com.example.TaskStudent.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController

public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse>
    handleNotFound(ResourceNotFoundException ex) {

        return buildResponse(ex.getMessage(),
                HttpStatus.NOT_FOUND);
    }




    @ExceptionHandler(BadRequest.class)
    public ResponseEntity<ErrorResponse>
    handleBadRequest(BadRequest ex) {

        return buildResponse(ex.getMessage(),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorResponse>
    handleUnauthorized(UnauthorizedException ex) {

        return buildResponse(ex.getMessage(),
                HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse>
    handleGlobal(Exception ex) {

        return buildResponse(ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ErrorResponse>
    buildResponse(String message, HttpStatus status) {

        ErrorResponse response = ErrorResponse.builder()
                .timestamp(LocalDate.now())
                .status(status.value())
                .error(status.getReasonPhrase())
                .message(message)
                .build();

        return new ResponseEntity<>(response, status);
    }
}
