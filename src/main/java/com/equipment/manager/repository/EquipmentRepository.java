package com.equipment.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipment.manager.model.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
