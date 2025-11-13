package com.univus.project.repository;

import com.univus.project.constant.Role;
import com.univus.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

    Optional<User> findByEmailAndPwd(String email, String pwd);

    // Optional은 하나의 객체만 반환하기 때문에 List
    List<User> findByRole(Role role);
}
