package com.stockmarket.loginSignup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockmarket.loginSignup.entities.User;
import com.stockmarket.loginSignup.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
    private UserService userService;
    
    
    @GetMapping("/greet/{fn}/{ln}")
    public String greet(@PathVariable String fn, @PathVariable String ln){
    	return "Welcome "+fn+ " "+ln;
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> getLogin(@RequestBody User user){
        System.out.println(user);
        boolean isValid = userService.getLogin(user);
        return new ResponseEntity<Boolean>(isValid, HttpStatus.OK);
    }
    
    @PostMapping("/register")
    public ResponseEntity<User> getSignup(@RequestBody User user){
        System.out.println(user);
        User u = userService.getSignup(user);
        return new ResponseEntity<User>(u, HttpStatus.OK);
    }
}
