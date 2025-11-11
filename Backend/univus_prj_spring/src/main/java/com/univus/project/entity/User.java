package com.univus.project.entity;
// 회원

import com.univus.project.constant.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "users")
@Inheritance(strategy = InheritanceType.JOINED)   // 하위 엔티티 분리 테이블 방식 (교수 / 학생)
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String name;

    @Column
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;        // 권한 (STUDENT, PROFESSOR 등)

}
