package com.example.twitterclone.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity //It will create a table in DataBase and it is replica of model
@Data  // It will reduce our need to generate Constructors , Getter Setter , ToString

/*
 * 
 */
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email_id;
    private String password;
}
