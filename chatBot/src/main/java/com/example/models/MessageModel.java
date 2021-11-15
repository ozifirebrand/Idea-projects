package com.example.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity

public class MessageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 255)
    private  String messageTextField;

    @Column(nullable = false)
    private LocalDateTime timeOfMessageCreation;

}
