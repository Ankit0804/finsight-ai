package main.java.com.finsight.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import main.java.com.finsight.demo.model.FinsightUser;
import main.java.com.finsight.demo.repository.FinsightUserRepository;

@Service
public class FinsightUserService {

    private FinsightUserRepository userRepository;
    @Autowired private PasswordEncoder passwordEncoder;

    public FinsightUserService(FinsightUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<FinsightUser> getAllUser() {
       return userRepository.findAll();
    }
    public void createUser(FinsightUser user) {
        userRepository.save(user);
    }

    public FinsightUser login(String email, String rawPassword) {
        FinsightUser user = userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found"));

        if(!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new UsernameNotFoundException("Invalid password");
        }
        return user;
    }
    
}
