package study.groom.domain.member.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import study.groom.domain.model.entity.BaseEntity;
import study.groom.domain.model.enums.MemberStatus;
import study.groom.domain.model.enums.SocialType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@DynamicUpdate
@DynamicInsert
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(length = 30)
    private String nickname;

    @Column(unique = true)
    private String clokeyId;

    @Column(length = 100) //한줄 소개
    private String bio;

    @Enumerated(EnumType.STRING) //가입종류
    @Column(nullable = false)
    private SocialType socialType;

    private String profileImageUrl;

    private String profileBackImageUrl;

    @Enumerated(EnumType.STRING) //활성화여부
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'", nullable = false)
    private MemberStatus status;
}
