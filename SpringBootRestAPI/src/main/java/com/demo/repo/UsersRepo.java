package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer>{

}
