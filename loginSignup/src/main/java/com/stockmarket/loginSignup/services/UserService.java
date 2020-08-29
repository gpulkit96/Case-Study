package com.stockmarket.loginSignup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmarket.loginSignup.entities.User;
import com.stockmarket.loginSignup.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository repo;

    public boolean getLogin(User user){
        Iterable<User> iterable = repo.findAll();
		boolean found = false;
		for(User u : iterable) {
            if(u.getUsername().equals(user.getUsername())){
                found = u.getPassword().equals(user.getPassword());
                break;
            }
		}

        return found;
    }
    
	public User getSignup(User user) {
		// logic -> user.username != null, 
		return repo.save(user);
		}
}
