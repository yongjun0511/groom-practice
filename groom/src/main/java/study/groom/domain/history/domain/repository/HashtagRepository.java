package study.groom.domain.history.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.history.domain.entity.Hashtag;

public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
}
