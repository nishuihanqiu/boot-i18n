package com.lls.i18n.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/************************************
 * NotFoundException
 * @author liliangshan
 * @date 2019-07-18
 ************************************/

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    private String code = "NOT_FOUND_EXCEPTION";

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getCode() {
        return code;
    }

}
