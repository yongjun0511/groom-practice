package study.groom.domain.member.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.member.domain.entity.MemberTerm;

public interface MemberTermRepository extends JpaRepository<MemberTerm, Long> {
}
