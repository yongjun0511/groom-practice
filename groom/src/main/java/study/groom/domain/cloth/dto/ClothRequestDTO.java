package study.groom.domain.cloth.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.groom.domain.model.enums.Season;
import study.groom.domain.model.enums.ThicknessLevel;

import java.util.List;

public class ClothRequestDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ClothCreateRequest {

        private Long memberId;

        private Long categoryId;

        private String name;

        private List<Season> seasons;

        private Integer tempUpperBound;

        private Integer tempLowerBound;

        private ThicknessLevel thicknessLevel;

        private String clothUrl;

        private String brand;
    }
}
