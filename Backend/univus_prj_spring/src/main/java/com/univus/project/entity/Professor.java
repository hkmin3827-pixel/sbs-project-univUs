package com.univus.project.entity;
// User 상속 받은 하위 교수 엔티티

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "professors")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Professor extends User {
    // 부가적으로 넣고 싶은 교수 정보 => 소속 학과 정보 or 연구실 번호 등 변수 생성 가능
}