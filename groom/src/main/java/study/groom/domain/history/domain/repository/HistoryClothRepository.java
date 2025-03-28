package study.groom.domain.history.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.history.domain.entity.HistoryCloth;

public interface HistoryClothRepository extends JpaRepository<HistoryCloth,Long> {
}
