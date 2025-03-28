package study.groom.domain.cloth.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.cloth.domain.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
