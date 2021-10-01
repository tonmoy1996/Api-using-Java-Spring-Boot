package com.employe.employee.error;

public class DeparmentNotFoundException extends Exception {
    public DeparmentNotFoundException() {
        super();
    }

    public DeparmentNotFoundException(String message) {
        super(message);
    }

    public DeparmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeparmentNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DeparmentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
