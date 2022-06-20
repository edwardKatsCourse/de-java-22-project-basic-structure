package com.telran.buildingdemo.controller;

import com.telran.buildingdemo.dto.BuildingRequestDTO;
import com.telran.buildingdemo.dto.BuildingResponseDTO;
import com.telran.buildingdemo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("/buildings")
    public List<BuildingResponseDTO> getAllBuildings() {
        return buildingService.getAllBuildings();
    }

    @GetMapping("/buildings/{id}")
    public BuildingResponseDTO getBuildingById(@PathVariable("id") Long id) {
        return buildingService.getBuildingById(id);
    }

    @PostMapping("/buildings")
    public void createBuilding(@RequestBody BuildingRequestDTO request) {
        buildingService.createBuilding(request);
    }
}

