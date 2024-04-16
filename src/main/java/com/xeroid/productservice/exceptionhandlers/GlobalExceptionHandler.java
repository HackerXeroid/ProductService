package com.xeroid.productservice.exceptionhandlers;

import com.xeroid.productservice.dtos.ExceptionDto;
import com.xeroid.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Invalid productId " + productNotFoundException.getId() + " passed");
        dto.setResolution("ProductNotFoundException caught");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handleGeneralException() {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Something went wrong");
        dto.setResolution("Exception");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
}

