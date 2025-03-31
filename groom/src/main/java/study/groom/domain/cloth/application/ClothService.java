package study.groom.domain.cloth.application;

import org.springframework.web.multipart.MultipartFile;
import study.groom.domain.cloth.dto.ClothRequestDTO;
import study.groom.domain.cloth.dto.ClothResponseDTO;
import study.groom.domain.model.enums.ClothSort;

public interface ClothService {

    ClothResponseDTO.ClothEditViewResult getClothEditView(Long clothId);

    ClothResponseDTO.MemberClosetResult getMemberCloset(String clokeyId, ClothSort sort, int page, int size);

    ClothResponseDTO.ClothCreateResult createCloth(ClothRequestDTO.ClothCreateRequest clothCreateResult, MultipartFile image);
}
