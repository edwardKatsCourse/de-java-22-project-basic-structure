package com.telran.buildingdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class BuildingResponseDTO {

    private Long id;
    private String street;
    private String houseNumber;
}
