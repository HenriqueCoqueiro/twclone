package com.henriquecoqueiro.twclone.repository;

import com.henriquecoqueiro.twclone.model.entities.Role;
import com.henriquecoqueiro.twclone.model.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
