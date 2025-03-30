package study.groom.domain.cloth.converter;

import study.groom.domain.cloth.domain.entity.Cloth;
import study.groom.domain.cloth.dto.ClothResponseDTO;

public class ClothConverter {

    public static ClothResponseDTO.ClothEditViewResult toClothEditViewResult(Cloth cloth, String clothImageUrl){
        return ClothResponseDTO.ClothEditViewResult.builder()
                .id(cloth.getId())
                .brand(cloth.getBrand())
                .categoryId(cloth.getCategory().getId())
                .clothUrl(cloth.getClothUrl())
                .imageUrl(clothImageUrl)
                .name(cloth.getName())
                .seasons(cloth.getSeason())
                .tempLowerBound(cloth.getTempLowerBound())
                .tempUpperBound(cloth.getTempUpperBound())
                .thicknessLevel(cloth.getThicknessLevel())
                .build();
    }
}
