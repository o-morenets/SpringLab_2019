package oleksii.epam.lab.spring2019.springdemoback.repository;

import oleksii.epam.lab.spring2019.springdemoback.entity.Secret;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretRepository extends JpaRepository<Secret, String> {
}
