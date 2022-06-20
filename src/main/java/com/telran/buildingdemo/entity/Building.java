package com.telran.buildingdemo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "building")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Builder
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "floors_count")
    private Integer floorsCount;

}
