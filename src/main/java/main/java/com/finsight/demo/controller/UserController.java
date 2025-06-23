package main.java.com.finsight.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.finsight.demo.model.FinsightUser;
import main.java.com.finsight.demo.repository.UserRepository;
import main.java.com.finsight.demo.service.UserService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;
    
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }



    @GetMapping("")
    public List<FinsightUser> getAllUser() {
        return userService.getAllUser();
    }
    
    @PostMapping("")
    public void createUser(@RequestBody FinsightUser user) {
        userService.createUser(user);
    }

}
