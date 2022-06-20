package com.telran.buildingdemo.repository;

import com.telran.buildingdemo.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}
