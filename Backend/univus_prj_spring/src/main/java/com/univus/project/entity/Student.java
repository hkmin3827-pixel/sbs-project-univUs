package com.univus.project.entity;
// User 상속 받은 하위 학생 엔티티

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="students")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

public class Student extends User {
    // 전공 or 학년 같은 정보 등

}
