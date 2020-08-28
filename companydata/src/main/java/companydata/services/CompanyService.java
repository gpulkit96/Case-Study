package companydata.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import companydata.entities.Company;
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