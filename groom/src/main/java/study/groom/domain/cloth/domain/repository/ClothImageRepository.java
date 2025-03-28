package study.groom.domain.cloth.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.cloth.domain.entity.ClothImage;

public interface ClothImageRepository extends JpaRepository<ClothImage,Long> {
}
