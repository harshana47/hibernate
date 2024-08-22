package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ClassRoom {
    @Id
    private int id;
    private String name;
    private int count;

    public ClassRoom() {
    }

    public ClassRoom(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public int getGrade() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
