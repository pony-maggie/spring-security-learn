package org.spring.security.learn.chapter3.repository;


import org.spring.security.learn.chapter3.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<MyUser, Long> {

    MyUser findByUsername(String username);
}
