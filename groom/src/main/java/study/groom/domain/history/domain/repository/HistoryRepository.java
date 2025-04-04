package study.groom.domain.history.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.history.domain.entity.History;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
