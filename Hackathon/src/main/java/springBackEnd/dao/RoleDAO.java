package springBackEnd.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import springBackEnd.dto.ERole;
import springBackEnd.dto.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
