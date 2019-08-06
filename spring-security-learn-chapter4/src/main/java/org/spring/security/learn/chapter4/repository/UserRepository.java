package org.spring.security.learn.chapter4.repository;


import org.spring.security.learn.chapter4.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser, Long> {

    MyUser findByUsername(String username);
}
