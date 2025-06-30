package main.java.com.finsight.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FinsightRegisterRequest {

    @NotBlank(message = "Full name is required")   
    private String username;
        
    @NotBlank(message = "Password is required")
    @Size(min = 6)
    private String password;
        
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
