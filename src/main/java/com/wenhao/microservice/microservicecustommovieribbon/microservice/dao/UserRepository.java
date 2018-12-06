package com.wenhao.microservice.microservicecustommovieribbon.microservice.dao;

import com.wenhao.microservice.microservicecustommovieribbon.microservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
