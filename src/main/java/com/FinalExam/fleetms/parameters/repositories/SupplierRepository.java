package com.FinalExam.fleetms.parameters.repositories;

import com.FinalExam.fleetms.parameters.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
