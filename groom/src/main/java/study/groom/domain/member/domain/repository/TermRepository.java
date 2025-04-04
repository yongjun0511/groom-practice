package study.groom.domain.member.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.member.domain.entity.Term;

public interface TermRepository extends JpaRepository<Term, Long> {
}
