package companydata.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import companydata.entities.Company;
import companydata.services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("")
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }
    @GetMapping("{id}")
    public Optional<Company> getCompanyById(@PathVariable Integer id){
        return companyService.getCompany(id);
    }

    @PostMapping("")
    public void AddCompany(@RequestBody Company company){
    	companyService.addCompany(company);
    }
    @PutMapping("{id}")
    public void UpdateCompany(@PathVariable Integer id, Company company){
    	companyService.updateCompany(id, company);
    }
    @DeleteMapping("{id}")
    public void DeleteCompany(@PathVariable Integer id){
    	companyService.deleteCompany(id);
    }
}


/*public class CompanyController {

	@RequestMapping("/{name}")
	public Company getCompany(@PathVariable("name") String name) {

		Company company = new Company(1,name,"Charles",123,456,789,"NA",
				"None");
		return company;
	}
}
*/