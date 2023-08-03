package com.lcwd.hotel.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

        // handle specific exceptions
        @ExceptionHandler(ResourceNotFoundException.class)
        public ResponseEntity<Map<String,Object>> handleResourceNotFoundException(ResourceNotFoundException ex){
            Map map=new HashMap<>();
            map.put("message",ex.getMessage());
            map.put("success", false);
            map.put("status",HttpStatus.NOT_FOUND);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
        }
}
