package com.example.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.entity.User;
import com.example.demo.model.repository.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository user;

    //Lay danh sach tat ca user
    public List<User> getAllUsers() {
        return user.findAll();
    }

    //Lay user theo id
    public Optional<User> getUserById(Long id) {
        return user.findById(id);
    }

    //Them moi user
    public User createUser(User u) {
        return user.save(u);
    }

    //Cap nhat thong tin user
    public User updateUser(Long id, User userDetails){
        User u = user.findById(id).get();
        u.setName(userDetails.getName());
        u.setEmail(userDetails.getEmail());
        u.setPhone(userDetails.getPhone());
        u.setAddress(userDetails.getAddress());
        u.setRole(userDetails.getRole());
        u.setUserName(userDetails.getUserName());
        u.setPassWords(userDetails.getPassWords());
        return user.save(u);
    }

    //Xoa user
    public void deleteUser(Long id) {
        user.deleteById(id);
    }
}
