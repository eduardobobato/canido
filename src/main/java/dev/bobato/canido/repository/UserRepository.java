package dev.bobato.canido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.bobato.canido.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
