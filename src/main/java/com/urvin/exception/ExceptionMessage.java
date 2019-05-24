package com.urvin.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ExceptionMessage {
        private String exception;
        private HttpStatus errorCode;
        private Date date;

        public HttpStatus getErrorCode() {
        return errorCode;
    }

        public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    public ExceptionMessage(String exception, HttpStatus errorCode, Date date) {
        this.exception = exception;
        this.errorCode = errorCode;
        this.date = date;
    }

        public String getException() {
        return exception;
    }

        public void setException(String exception) {
        this.exception = exception;
    }


        public Date getDate() {
        return date;
    }

        public void setDate(Date date) {
        this.date = date;
    }
}
