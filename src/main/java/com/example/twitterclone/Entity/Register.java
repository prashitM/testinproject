package com.example.twitterclone.Entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

import lombok.Data;

import javax.persistence.*;

@Entity  //It will create a table in DataBase and it is replica of model
@Data   // It will reduce our need to generate Constructors , Getter Setter , ToString 

/*
 * This Class contains variables which will be created in DataBase
 */
public class Register {
    @Id  //it is used to create attribute in primary key
    @GeneratedValue(strategy = GenerationType.AUTO)  //it is used to increment the value
    private long id;
    private String name;
    private String password;
    private String email_id;
   
    
}
