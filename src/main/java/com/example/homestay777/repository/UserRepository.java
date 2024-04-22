package com.example.homestay777.repository;

import com.example.homestay777.model.UserHotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface UserRepository extends JpaRepository<UserHotel, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

   Optional<UserHotel> findByEmail(String email);
}
