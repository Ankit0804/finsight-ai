package main.java.com.finsight.demo.dto;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class FinsightLoginRequest {

    @Email(message = "Email is not valid")
    @NotBlank(message = "Email is required")
    private String email;
    
    @NotBlank(message = "Password is required")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
