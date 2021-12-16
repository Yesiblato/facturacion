package com.misiontic.facturacion.exceptions;

import javax.security.auth.login.AccountNotFoundException;

public class FacturaNotFoundException extends RuntimeException {
    public FacturaNotFoundException(String message){
        super(message);
    }
}
