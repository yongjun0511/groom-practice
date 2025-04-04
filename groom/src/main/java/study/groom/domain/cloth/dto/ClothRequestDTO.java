package study.groom.domain.cloth.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import study.groom.domain.cloth.exception.annotation.CheckLowerUpperTempBound;
import study.groom.domain.model.enums.Season;
import study.groom.domain.model.enums.ThicknessLevel;

import java.util.List;

public class ClothRequestDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @CheckLowerUpperTempBound
    public static class ClothCreateRequest {

        private Long memberId;

        private Long categoryId;

        private String name;

        private List<Season> seasons;

        @Max(40)
        @Min(-20)
        private Integer tempUpperBound;

        @Max(40)
        @Min(-20)
        private Integer tempLowerBound;

        private ThicknessLevel thicknessLevel;

        private String clothUrl;

        private String brand;
    }
}
