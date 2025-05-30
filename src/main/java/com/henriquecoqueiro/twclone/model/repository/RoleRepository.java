package com.henriquecoqueiro.twclone.model.repository;

import com.henriquecoqueiro.twclone.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
