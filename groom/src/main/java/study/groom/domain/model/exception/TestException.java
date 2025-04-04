package study.groom.domain.model.exception;

import study.groom.global.error.code.BaseErrorCode;
import study.groom.global.exception.GeneralException;

public class TestException extends GeneralException {

    public TestException(BaseErrorCode code) {
        super(code);
    }
}

