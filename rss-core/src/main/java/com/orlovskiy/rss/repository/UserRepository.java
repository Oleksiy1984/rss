package com.orlovskiy.rss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.orlovskiy.rss.entity.UserEntity;

/**
 * Author: Daniel
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByName(String name);

}
