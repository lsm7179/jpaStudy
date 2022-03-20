package com.example.ch14_15_16.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@EntityListeners(DuckListener.class)
public class Duck2 {

    @Id
    @GeneratedValue
    public Long id;

    private String name;

    protected Duck2() {
    }

    public Duck2(String name) {
        this(null, name);
    }

    public Duck2(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Duck2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck2 duck2 = (Duck2) o;
        return Objects.equals(id, duck2.id) && Objects.equals(name, duck2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
