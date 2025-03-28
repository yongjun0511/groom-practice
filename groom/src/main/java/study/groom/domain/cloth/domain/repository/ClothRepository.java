package study.groom.domain.cloth.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.cloth.domain.entity.Cloth;

public interface ClothRepository extends JpaRepository<Cloth, Long> {
}
