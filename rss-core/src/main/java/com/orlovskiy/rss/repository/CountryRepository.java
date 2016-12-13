package com.orlovskiy.rss.repository;

import com.orlovskiy.rss.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Daniel
 */
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
}
