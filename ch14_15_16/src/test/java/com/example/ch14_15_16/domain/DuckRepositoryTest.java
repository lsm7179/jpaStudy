package com.example.ch14_15_16.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class DuckRepositoryTest {

    @Autowired
    EntityManager em;

    @Autowired
    private DuckRepository duckRepository;

    @DisplayName("초기화 확인용")
    @Test
    void init() {

    }

    @DisplayName("생성테스트")
    @Test
    void create() {
        Duck duck = new Duck("테스트");

        Duck savedDuck = duckRepository.save(duck);
        em.flush();
        em.clear();
        assertThat(savedDuck.getId()).isNotNull();
    }
}
