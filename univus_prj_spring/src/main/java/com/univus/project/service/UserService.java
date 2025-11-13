package com.univus.project.service;

import com.univus.project.constant.Role;
import com.univus.project.dto.user.UserResDto;
import com.univus.project.entity.User;
import com.univus.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

// 공통 기능 로직
@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    // 전체 회원 조회
    public List<UserResDto> findAll() {
        List<User> users = userRepository.findAll();
        List<UserResDto> userResDtos = new ArrayList<>();
        for (User user : users) {
            userResDtos.add(coverEntityToDto(user));
        }
        return userResDtos;
    }

    // Role별 회워 조회
    public List<UserResDto> findByRole(Role role) {
        List<User> users = userRepository.findByRole(role);
        List<UserResDto> userResDtos = new ArrayList<>();
        for (User user : users) {
            userResDtos.add(coverEntityToDto(user));
        }
        return userResDtos;

    }



    private UserResDto coverEntityToDto(User user){
        UserResDto userResDto = new UserResDto();
        userResDto.setEmail(user.getEmail());
        userResDto.setName(user.getName());
        userResDto.setImage(user.getImage());
        userResDto.setRole(user.getRole());
        return userResDto;
    }
}
