package me.snajdovski.crossfit.data;

import me.snajdovski.crossfit.controller.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICrossfitUsersRepository extends JpaRepository<User, Long>{

    //SELECT * FROM user WHERE name = smth
    @Query("SELECT u FROM User u WHERE u.name = ?1")
    Optional<User> findUserByName(String name);
}
