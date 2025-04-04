package study.groom.domain.member.domain.exception;

import study.groom.global.error.code.BaseErrorCode;
import study.groom.global.exception.GeneralException;

public class MemberException extends GeneralException {

    public MemberException(BaseErrorCode code) {
        super(code);
    }
}
