package main.java.com.finsight.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.finsight.demo.dto.FinsightLoginRequest;
import main.java.com.finsight.demo.dto.FinsightRegisterRequest;
import main.java.com.finsight.demo.model.FinsightUser;
import main.java.com.finsight.demo.repository.FinsightUserRepository;
import main.java.com.finsight.demo.service.FinsightUserService;

import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/user")
public class FinsightUserController {

    private final FinsightUserService userService;
    private final FinsightUserRepository userRepository;
    @Autowired private PasswordEncoder passwordEncoder;
    
    public FinsightUserController(FinsightUserService userService, FinsightUserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }



    @GetMapping("")
    public List<String> getAllUser() {
        return userService.getAllUser()
            .stream()
            .map(user -> user.getEmail() + " (" + user.getUsername() + ")")
            .toList();
    }
    
    @PostMapping("")
    public void createUser(@RequestBody FinsightUser user) {
        userService.createUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody FinsightLoginRequest request) {
        FinsightUser user = userService.login(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(Map.of("message", "Login successful", "user", user.getEmail()));
    }
    
    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody FinsightRegisterRequest request) {
        FinsightUser user = new FinsightUser();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setUsername(request.getUsername());
        userService.createUser(user);
        return ResponseEntity.ok(Map.of("message", "User registered successfully"));
    }
    

}
