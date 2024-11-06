package com.educandoweb.courseVitor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseVitor.entities.User;

public interface UserRepository extends JpaRepository <User,Long>{

}
