package com.aishwarya.fullstack.repository;

import com.aishwarya.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
