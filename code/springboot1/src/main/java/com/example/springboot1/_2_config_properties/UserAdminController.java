package com.example.springboot1._2_config_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAdminController {

    @Autowired
    private UserAdmin userAdmin;
    
    @RequestMapping("/user-admin")
    public UserAdmin userAdmin(){
        return userAdmin;
    }
}
