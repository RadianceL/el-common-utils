package com.el.common.support.exception;

import com.el.common.support.exception.data.ErrorMessage;

import java.util.Objects;

/**
 * 重要异常
 * since 2019/12/7
 *
 * @author eddie
 */
public class ImportantErrorException extends Exception{

    private ErrorMessage errorMessage;

    public ImportantErrorException(){
        this(ErrorMessage.EMPTY_ERROR_MESSAGE);
        this.errorMessage = ErrorMessage.EMPTY_ERROR_MESSAGE;
    }

    public ImportantErrorException(ErrorMessage errorMessage) {
        super(errorMessage.getErrorMessage());
        this.errorMessage = errorMessage;
    }

    public ImportantErrorException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage.getErrorMessage(), cause);
        this.errorMessage = errorMessage;
    }

    public ImportantErrorException(ErrorMessage errorMessage, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(errorMessage.getErrorMessage(), cause, enableSuppression, writableStackTrace);
        this.errorMessage = errorMessage;
    }

    public String getErrorCode(){
        if (Objects.isNull(errorMessage)){
            return "";
        }
        return errorMessage.getErrorCode();
    }
}
