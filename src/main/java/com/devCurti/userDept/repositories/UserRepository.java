package com.devCurti.userDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devCurti.userDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
