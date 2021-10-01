package com.employe.employee.error;

public class EmployeNotFoundException extends Exception {
    public EmployeNotFoundException() {
        super();
    }

    public EmployeNotFoundException(String message) {
        super(message);
    }

    public EmployeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeNotFoundException(Throwable cause) {
        super(cause);
    }

    protected EmployeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
