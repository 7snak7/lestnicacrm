package ru.snack.spring.springboot.lestnica_crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shops_anix")
public class AnixShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "number")
    private String number;

    @Column(name = "manager")
    private String manager;

    @Column(name = "bush_director")
    private String bushDirector;

    public AnixShop() {
    }

    public AnixShop(String name, String address, String city, String number, String manager, String bushDirector) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.number = number;
        this.manager = manager;
        this.bushDirector = bushDirector;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getBushDirector() {
        return bushDirector;
    }

    public void setBushDirector(String bushDirector) {
        this.bushDirector = bushDirector;
    }

    @Override
    public String toString() {
        return "ShopAnix{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                ", manager='" + manager + '\'' +
                ", bushDirector='" + bushDirector + '\'' +
                '}';
    }
}
