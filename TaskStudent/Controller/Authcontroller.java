package com.example.TaskStudent.Controller;


import com.example.TaskStudent.DTO.Authdto;
import com.example.TaskStudent.DTO.Logindto;
import com.example.TaskStudent.DTO.Registerdto;
import com.example.TaskStudent.Service.Authservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class Authcontroller {

    private final Authservice authService;

    @PostMapping("/register")
    public String register(@RequestBody Registerdto request) {
        authService.register(request);
        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public Authdto login(@RequestBody Logindto request) {
        return authService.login(request);
    }

    @DeleteMapping("/{id}")
    public String deleteAuth(@PathVariable Long id) {
        authService.deleteAuth(id);
        return "User deleted successfully";
    }






}
