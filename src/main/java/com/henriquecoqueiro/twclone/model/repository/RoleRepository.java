package com.henriquecoqueiro.twclone.model.repository;

import com.henriquecoqueiro.twclone.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
