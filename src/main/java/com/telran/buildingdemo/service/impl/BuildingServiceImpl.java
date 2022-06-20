package com.telran.buildingdemo.service.impl;

import com.telran.buildingdemo.dto.BuildingRequestDTO;
import com.telran.buildingdemo.dto.BuildingResponseDTO;
import com.telran.buildingdemo.entity.Building;
import com.telran.buildingdemo.repository.BuildingRepository;
import com.telran.buildingdemo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    // ctrl + i


    @Override
    public void createBuilding(BuildingRequestDTO request) {

        Building building = Building.builder()
                .street(request.getStreet())
                .houseNumber(request.getHouseNumber())
                .floorsCount(request.getFloorsCount())
                .build();

        buildingRepository.save(building);
    }

    @Override
    public List<BuildingResponseDTO> getAllBuildings() {

        // List<Building>
        return buildingRepository.findAll()
                .stream()
                .map(building -> BuildingResponseDTO.builder()
                        .id(building.getId())
                        .houseNumber(building.getHouseNumber())
                        .street(building.getStreet())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public BuildingResponseDTO getBuildingById(Long id) {
        Building building = buildingRepository
                .findById(id) // Optional
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return BuildingResponseDTO.builder()
                .id(building.getId())
                .street(building.getStreet())
                .houseNumber(building.getHouseNumber())
                .build();
    }
}
