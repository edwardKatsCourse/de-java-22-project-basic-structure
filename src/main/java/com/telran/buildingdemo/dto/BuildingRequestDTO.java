package com.telran.buildingdemo.dto;

import lombok.*;

@AllArgsConstructor
@Data
public class BuildingRequestDTO {

    private String street;
    private String houseNumber;
    private Integer floorsCount;
}
