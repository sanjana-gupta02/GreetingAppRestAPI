package com.spring.RestAPI.repository;

import com.spring.RestAPI.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {  // ✅ Add Generic Types
}
