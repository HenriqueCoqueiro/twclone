package com.henriquecoqueiro.twclone.model.repository;

import com.henriquecoqueiro.twclone.model.entities.Role;
import com.henriquecoqueiro.twclone.model.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
