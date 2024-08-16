package quiz.physics.byjsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import quiz.physics.byjsd.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}