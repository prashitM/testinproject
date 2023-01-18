package com.example.twitterclone.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.twitterclone.Entity.Login;

@Repository
public interface Logrepository extends CrudRepository <Login , Long> {}
