package com.stockmarket.sectorservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockmarket.sectorservice.entities.Company;
import com.stockmarket.sectorservice.entities.Sector;
import com.stockmarket.sectorservice.services.CompanyService;

@RestController
@RequestMapping("/sectors")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/{sectorId}/companies")
	public List<Company> getAllCompanies(@PathVariable Integer sectorId){
		return companyService.getAllCompanies(sectorId);
	}
	
	@PostMapping("/{sectorId}/companies")
	public ResponseEntity<Company> AddCompany(@RequestBody Company company, @PathVariable Integer sectorId) {
		company.setSector(new Sector(sectorId,"",""));
		return new ResponseEntity<Company>(companyService.addCompany(company), HttpStatus.OK);
	}
	@PutMapping("/{sectorId}/companies/{id}")
	public ResponseEntity<Company> UpdateCompany(@RequestBody Company company, @PathVariable Integer sectorId) {
		company.setSector(new Sector(sectorId,"",""));
		return new ResponseEntity<Company>(companyService.updateCompany(company), HttpStatus.OK);
	}
	@DeleteMapping("/{sectorId}/companies/{id}")
	public void DeleteCompany(@PathVariable Integer id) {
		companyService.deleteCompany(id);
	}
}
