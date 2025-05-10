package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_User")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Address")
    private String address;
    @Column(name = "Role")
    private String role;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "PassWord")
    private String passWords; 

    public User(String name, String email, String phone, String address, String role, String userName, String passWords) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.userName = userName;
        this.passWords = passWords;
    }


}
