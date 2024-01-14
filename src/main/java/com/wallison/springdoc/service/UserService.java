package com.wallison.springdoc.service;

import com.wallison.springdoc.model.User;
import com.wallison.springdoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findAllById(id);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id, User newUser) {
        newUser.setId(id);
        return userRepository.save(newUser);
    }
}
