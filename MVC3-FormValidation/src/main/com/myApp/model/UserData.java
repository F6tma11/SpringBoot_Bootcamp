package main.com.myApp.model;

import main.com.myApp.annotations.PasswordMatches;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Component
@PasswordMatches
public class UserData {

    @NotBlank(message = "This field can not empty or null.")
    private String username;
    @NotBlank(message = "The password fields should be match.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*_+=]).{8,}$",
    message = "Password should be at least 8 char and contains capital and small characters digits and special character ")
    private String password;
    @NotBlank(message = "This field can not empty or null.")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{2,}$" ,message = "Invalid Email")
    private String email;
    @NotBlank(message = "Confirm password cannot be empty.")
    private String confirmPassword;

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
