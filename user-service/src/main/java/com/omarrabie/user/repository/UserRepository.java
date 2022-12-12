package com.omarrabie.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omarrabie.user.entity.Userz;

@Repository
public interface UserRepository  extends JpaRepository<Userz,Long> {
    Userz findByUserId(Long userId);
}
