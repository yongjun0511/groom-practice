package study.groom.domain.member.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.member.domain.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByClokeyId(String clokeyId);

}
