package com.example.ch14_15_16.domain;

import javax.persistence.*;

@Entity
public class Duck {

    @Id
    @GeneratedValue
    public Long id;

    private String name;

    protected Duck() {
    }

    public Duck(String name) {
        this(null, name);
    }

    public Duck(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @PrePersist
    public void proPersist() {
        System.out.println("Duck.proPersist = " + id);
    }

    @PostPersist
    public void postPersist() {
        //flush나 commit을 호출해서 엔티티를 데이터베이스에 저장한 직후에 호출된다.
        System.out.println("Duck.postPersist = " + id);
    }

    @PostLoad
    public void postLoad() {
        System.out.println("Duck.postLoad = " + id);
    }

    @PreRemove
    public void preRemove() {
        System.out.println("Duck.preRemove = " + id);
    }

    @PostRemove
    public void postRemove() {
        System.out.println("Duck.postRemove = " + id);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
