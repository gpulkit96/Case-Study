package com.stockmarket.sectorservice.repositories;

import com.stockmarket.sectorservice.entities.Company;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer>{
	public List<Company> findBySectorId(Integer sectorId);
}
