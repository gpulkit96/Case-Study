package companydata.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import companydata.entities.Company;
import companydata.models.CompanyList;
import companydata.repositories.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    
    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll()
                .forEach(companies::add);
        return companies;
    }
    public CompanyList getSectorCompanies(Integer id){
    	List<String> company_list = new ArrayList<>();
    	Iterable<Company> iterable = companyRepository.findAll();
    	for(Company c:iterable) {
    		if(c.getSector_id().equals(id)) {
    			company_list.add(c.getName());
    		}
    	}
    	return new CompanyList(id, company_list);
//    	CompanyList companies = new CompanyList();
    	
    }

    public Optional<Company> getCompany(Integer id) {
        return companyRepository.findById(id);
    }
    public void addCompany(Company company) {
    	companyRepository.save(company);
    }
    public void updateCompany(Integer id, Company company) {
    	companyRepository.save(company);
    }
    public void deleteCompany(Integer id) {
    	companyRepository.deleteById(id);
    }
}