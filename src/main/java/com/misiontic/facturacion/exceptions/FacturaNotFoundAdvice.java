package com.misiontic.facturacion.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@ResponseBody

public class FacturaNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(FacturaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvide(FacturaNotFoundException ex){
        return ex.getMessage();
    }
}
