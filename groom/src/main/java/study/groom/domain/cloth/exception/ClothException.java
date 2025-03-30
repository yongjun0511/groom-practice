package study.groom.domain.cloth.exception;

import study.groom.global.error.code.BaseErrorCode;
import study.groom.global.exception.GeneralException;

public class ClothException extends GeneralException {

    public ClothException(BaseErrorCode code) {
        super(code);
    }
}
