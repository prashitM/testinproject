package com.example.twitterclone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping; 

import com.example.twitterclone.DAO.UserRepository;
import com.example.twitterclone.Entity.Register;
 

@Controller  // It is used to control whole project
public class Controllers {

    @Autowired  // Helps to create a object without "new" keywordssssss
    UserRepository userRepository;

/*
 * This method is used to call the registration page
 */
@RequestMapping("/signup")
public String Registrations(Register register)
{
    return "Registration";
}

/*
 * This method is to store the registration data in MySql
 * The data is stored in 'register' variable which is used alongside Model
 */
@PostMapping("/adduser")
    public String addUser(@Validated Register register,Model model) {  
        this.userRepository.save(register);// it is used to store the data into database
        return "Homepage";
    }
    
}


