package com.FinalExam.fleetms.parameters.services;

import com.FinalExam.fleetms.parameters.repositories.SupplierRepository;
import com.FinalExam.fleetms.parameters.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;

	//Get All Suppliers
	public List<Supplier> findAll(){
		return supplierRepository.findAll();
	}

	//Get Supplier By Id
	public Supplier findById(int id) {
		return supplierRepository.findById(id).orElse(null);
	}

	//Delete Supplier
	public void deleteById(int id) {
		supplierRepository.deleteById(id);
	}

	//Update Supplier
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}

}
