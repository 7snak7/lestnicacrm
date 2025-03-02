package ru.snack.spring.springboot.lestnica_crm.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "anix_shops")
public class AnixShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String address;
    @JsonProperty
    private String city;
    @JsonProperty
    private String number;
    @JsonProperty
    private String manager;
    @JsonProperty
    @Column(name = "bush_director")
    private String bushDirector;

}
