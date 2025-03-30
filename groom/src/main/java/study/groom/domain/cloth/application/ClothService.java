package study.groom.domain.cloth.application;

import study.groom.domain.cloth.dto.ClothResponseDTO;

public interface ClothService {

    ClothResponseDTO.ClothEditViewResult getClothEditView(Long clothId);

}
