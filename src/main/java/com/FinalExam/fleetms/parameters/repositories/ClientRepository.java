package com.FinalExam.fleetms.parameters.repositories;

import com.FinalExam.fleetms.parameters.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
