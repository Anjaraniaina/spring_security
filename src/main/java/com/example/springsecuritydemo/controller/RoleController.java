package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Role;
import com.example.springsecuritydemo.repository.RoleRepository;
import com.example.springsecuritydemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin
public class RoleController {
    private RoleRepository roleRepository;
    @PostMapping("/addrole")
    public Role addRole(@RequestBody Role role){
        return roleRepository.save(role);
    }
}
