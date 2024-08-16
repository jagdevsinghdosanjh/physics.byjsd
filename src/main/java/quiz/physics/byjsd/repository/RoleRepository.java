package quiz.physics.byjsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import quiz.physics.byjsd.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}