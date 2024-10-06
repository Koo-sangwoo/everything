package org.example.everything.db.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lucky6757
 * @apiNote 유저 정보를 담는 테이블의 Entity
 * 초기 JPA 연동 테스트를 위한 간단한 테이블
 * @since 2024/10/06
 */

@Entity(name = "user_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    // PK, 유저의 아이디값
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    // 유저의 실제이름
    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    // 유저의 비밀번호, 추후에는 암호화 예정
    @Column(name = "USER_PASSWORD", nullable = false)
    private String userPw;

}
