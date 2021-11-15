package com.example.models;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity

public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String clientName;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 70, unique = true)
    private String email;

    @Column(nullable = false, length = 13, unique = true)
    private String mobileNumber;

    @Column(nullable = false, length = 4)
    private int year;

    @Column(nullable = false, length = 20)
    private String country;

    @Column(nullable = false, length = 11)
    private String password;
}
