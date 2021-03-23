package com.example.demo;

import java.util.Objects;

public class User {
    private String Name;
    private Long id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Name, user.Name) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, id);
    }
}
