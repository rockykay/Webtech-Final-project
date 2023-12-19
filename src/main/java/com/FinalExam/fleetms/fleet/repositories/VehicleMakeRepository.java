package com.FinalExam.fleetms.fleet.repositories;

import com.FinalExam.fleetms.fleet.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
