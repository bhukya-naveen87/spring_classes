package com.example.springboot1._2_config_properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "user-admin")
@Component
public class UserAdmin {
    private String username;
    private String password;
    private String permisssion;

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
    public String getPermisssion() {
        return permisssion;
    }
    public void setPermisssion(String permisssion) {
        this.permisssion = permisssion;
    }
    @Override
    public String toString() {
        return "UserAdmin [username=" + username + ", password=" + password + ", permisssion=" + permisssion + "]";
    }    
}
