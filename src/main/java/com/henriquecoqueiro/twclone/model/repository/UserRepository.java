package com.henriquecoqueiro.twclone.model.repository;

import com.henriquecoqueiro.twclone.model.entities.Role;
import com.henriquecoqueiro.twclone.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
