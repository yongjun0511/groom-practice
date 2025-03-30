package study.groom.domain.cloth.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import study.groom.domain.cloth.application.ClothService;
import study.groom.domain.cloth.dto.ClothResponseDTO;
import study.groom.global.common.response.BaseResponse;
import study.groom.global.error.code.status.SuccessStatus;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cloth")
@Validated
public class ClothRestController {

    private final ClothService clothService;

    @GetMapping("/{cloth-id}/edit-view")
    @Operation(summary = "특정 Cloth에 대한 정보를 수정용으로 조회하는 API", description = "Path Variable로 clothId를 던져주세요.")
    @ApiResponses({
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "CLOTH_200", description = "OK, 성공적으로 조회되었습니다."),
    })
    public BaseResponse<ClothResponseDTO.ClothEditViewResult> getClothEditView(
            @PathVariable(name = "cloth-id") Long clothId
    ) {
        ClothResponseDTO.ClothEditViewResult result = clothService.getClothEditView(clothId);

        return BaseResponse.onSuccess(SuccessStatus.CLOTH_VIEW_SUCCESS, result);
    }
}
