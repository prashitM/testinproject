package com.example.twitterclone.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.twitterclone.DAO.UserRepository;
import com.example.twitterclone.Entity.Login;
import com.example.twitterclone.Entity.Register;

@Controller
public class LoginController {
    
    @Autowired
    UserRepository userRepository;

/*
 * The list will make a resizable array
 * It will check if the data is available in DataBase 
 */
    private List<Register> lRegisters;

    public LoginController()
    {
    lRegisters=new ArrayList<>();
    }
    
/*
 * This method is used to call the login form
 */
    @GetMapping("/login_form")  
public String logins(Login login ,Model model)
{

  return "Login";
}


/*
 * This method is used to check data is present in DataBase
 * The data is stored in 'login' variable which is used alongside Model
 */
@PostMapping("/logincontroller")
public String login_page(@Validated Login login , Model model){
    
    String w= login.getEmail_id(); 
    String m=login.getPassword();
    

    this.userRepository.save(login);
 
    lRegisters.addAll((Collection<? extends Register>) userRepository.findAll());

      for(int i=0;i<lRegisters.size();i++)
      {
            if(
           w  .equals(lRegisters.get(i).getEmail_id()) &&  m   .equals(lRegisters.get(i).getPassword()))
            {
                
              return "Homepage";
         
            }

      }



    return "Registration";
 }

@RequestMapping("/Loginpage")
public String lp(@Validated Register register , Model model){
  return "LoginMain";
}

 @PostMapping("/Loginpg")
  public String loginconnector(@Validated  Register register , Model model){
    
    String n=register.getName();
    this.userRepository.save(register);
    
    lRegisters.addAll((Collection<? extends Register>) userRepository.findAll());

      for(int i=0;i<lRegisters.size();i++)
      {
            if(n.equals(lRegisters.get(i).getName()))
            {
                
              return "Homepage";
         
            }
            // else{
            //   return "redirect:/Registration";
            // }
         

      }
    return "Registration";

  }
 

}
