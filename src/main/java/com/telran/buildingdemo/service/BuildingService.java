package com.telran.buildingdemo.service;

import com.telran.buildingdemo.dto.BuildingRequestDTO;
import com.telran.buildingdemo.dto.BuildingResponseDTO;

import java.util.List;

public interface BuildingService {

    // POST Mapping @RequestBody
    void createBuilding(BuildingRequestDTO request);

    // GET Mapping /buildings
    List<BuildingResponseDTO> getAllBuildings();

    // GET Mapping /buildings/{id}
    BuildingResponseDTO getBuildingById(Long id);
}
