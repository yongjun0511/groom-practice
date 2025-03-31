package study.groom.domain.cloth.exception.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import study.groom.domain.cloth.dto.ClothRequestDTO;
import study.groom.domain.cloth.exception.annotation.CheckLowerUpperTempBound;
import study.groom.domain.model.exception.annotation.CheckPage;
import study.groom.global.error.code.status.ErrorStatus;

@Component
@RequiredArgsConstructor
public class CheckLowerUpperTempBoundValidator implements ConstraintValidator<CheckLowerUpperTempBound, ClothRequestDTO.ClothCreateRequest> {

    @Override
    public void initialize(CheckLowerUpperTempBound constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(ClothRequestDTO.ClothCreateRequest request, ConstraintValidatorContext context) {
        boolean isValid = request.getTempLowerBound() <= request.getTempUpperBound();

        if (!isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(ErrorStatus.LOWER_TEMP_BIGGER_THAN_UPPER_TEMP.toString()).addConstraintViolation();
        }

        return isValid;

    }
}
