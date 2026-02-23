package com.example.TaskStudent.Service;

import com.example.TaskStudent.DTO.Authdto;
import com.example.TaskStudent.DTO.Logindto;
import com.example.TaskStudent.DTO.Registerdto;
import com.example.TaskStudent.Entity.Role;
import com.example.TaskStudent.Entity.User;
import com.example.TaskStudent.Repository.UserRepository;
import com.example.TaskStudent.Security.JwtUtil;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;

@AllArgsConstructor
public class Authservice {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public void register(Registerdto request) {
        if (userRepository.findByUsername(request.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.USER);

        userRepository.save(user);
    }

    public Authdto login(Logindto request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        String token = jwtUtil.generateToken(request.getUsername());
        return new Authdto(token);
    }

    public void deleteAuth(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }



}
