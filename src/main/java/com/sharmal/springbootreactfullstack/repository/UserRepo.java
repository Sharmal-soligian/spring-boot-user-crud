package com.sharmal.springbootreactfullstack.repository;

import com.sharmal.springbootreactfullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
