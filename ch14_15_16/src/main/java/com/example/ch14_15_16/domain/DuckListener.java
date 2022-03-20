package com.example.ch14_15_16.domain;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class DuckListener {

    @PrePersist
    private void proPersist(Object obj) {
        System.out.println("Duck.proPersist = " + obj);
    }

    @PostPersist
    private void postPersist(Object obj) {
        System.out.println("Duck.postPersist = " + obj);
    }
}
