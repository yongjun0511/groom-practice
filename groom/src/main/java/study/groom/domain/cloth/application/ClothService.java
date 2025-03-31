package study.groom.domain.cloth.application;

import study.groom.domain.cloth.dto.ClothResponseDTO;
import study.groom.domain.model.enums.ClothSort;

public interface ClothService {

    ClothResponseDTO.ClothEditViewResult getClothEditView(Long clothId);

    ClothResponseDTO.MemberClosetResult getMemberCloset(String clokeyId, ClothSort sort, int page, int size);
}
