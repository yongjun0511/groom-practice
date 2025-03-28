package study.groom.domain.history.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.history.domain.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
