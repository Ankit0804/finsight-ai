package main.java.com.finsight.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import main.java.com.finsight.demo.model.FinsightUser;
import main.java.com.finsight.demo.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<FinsightUser> getAllUser() {
       return userRepository.findAll();
    }
    public void createUser(FinsightUser user) {
        userRepository.save(user);
    }
    
}
