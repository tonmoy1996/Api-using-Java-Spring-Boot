package com.employe.employee.error;

import com.employe.employee.models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseCustomException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DeparmentNotFoundException.class)
    ResponseEntity<ErrorMessage> departmentNotFoundException(DeparmentNotFoundException exception, WebRequest request) {

        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);

    }
}
