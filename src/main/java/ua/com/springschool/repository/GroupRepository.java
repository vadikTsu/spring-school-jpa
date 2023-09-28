package ua.com.springschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.springschool.entity.Group;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<Group, UUID> {
}
