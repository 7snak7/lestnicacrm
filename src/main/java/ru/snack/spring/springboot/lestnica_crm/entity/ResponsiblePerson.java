package ru.snack.spring.springboot.lestnica_crm.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "responsible_persons")
public class ResponsiblePerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public ResponsiblePerson() {}

    public ResponsiblePerson(String name) {
        this.name = name;
    }

    public int getId() {
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

    @Override
    public String toString() {
        return "ResponsiblePerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
