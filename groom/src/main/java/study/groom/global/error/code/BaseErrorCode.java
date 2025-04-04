package study.groom.global.error.code;

public interface BaseErrorCode {

    String getCode();

    String getMessage();

    ErrorReasonDTO getReasonHttpStatus();
}
