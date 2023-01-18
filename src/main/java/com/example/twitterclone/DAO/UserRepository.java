package com.example.twitterclone.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.twitterclone.Entity.Login;
import com.example.twitterclone.Entity.Register;

@Repository  // It is used to control Repository

/*
 * This interface to create a layer between Controller and Model
 */
public interface UserRepository extends CrudRepository<Register , Long>{

    void save(Login login);}
