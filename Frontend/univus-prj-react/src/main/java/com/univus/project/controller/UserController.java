package com.univus.project.controller;
// 공통 수행 기능

import com.univus.project.constant.Role;
import com.univus.project.dto.user.UserResDto;
import com.univus.project.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<UserResDto>> getUserList() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/list{role}")
    public ResponseEntity<List<UserResDto>> getUserRoleList(
            @RequestParam(required = false)Role role
            ) {
        List<UserResDto> result = (role == null) ? userService.findAll() : userService.findByRole(role);

        return ResponseEntity.ok(result);
    }
}
