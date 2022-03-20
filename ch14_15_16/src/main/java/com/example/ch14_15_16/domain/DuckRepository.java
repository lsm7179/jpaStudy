package com.example.ch14_15_16.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DuckRepository extends JpaRepository<Duck, Long> {
}
