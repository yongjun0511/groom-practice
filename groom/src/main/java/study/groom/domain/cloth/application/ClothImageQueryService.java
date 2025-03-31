package study.groom.domain.cloth.application;

import study.groom.domain.cloth.domain.entity.Cloth;

import java.util.Map;

public interface ClothImageQueryService {

    Map<Long, String> getFirstImageUrlMap(Iterable<Cloth> clothes);

}
