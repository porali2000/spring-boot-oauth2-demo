package com.por.demo.repo;

import com.por.demo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String>{
    UserDetails findOneByUsername(String username);
}
