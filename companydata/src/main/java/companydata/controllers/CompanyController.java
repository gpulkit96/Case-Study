package companydata.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import companydata.entities.Company;
import companydata.models.CompanyList;
import companydata.services.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins="http://localhost:4200")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("")
    public ResponseEntity<List<Company>> getAllCompanies(){
        return new ResponseEntity<List<Company>>(companyService.getAllCompanies(), HttpStatus.OK);
    }
    @GetMapping("{id}")
    public Optional<Company> getCompanyById(@PathVariable Integer id){
        return companyService.getCompany(id);
    }
    @GetMapping("/sector/{id}")
    public CompanyList getCompaniesBySector(@PathVariable Integer id){
    	return companyService.getSectorCompanies(id);
    }
    
    @PostMapping("/admin")// now only Admin can add a company
    public void AddCompany(@RequestBody Company company){
    	companyService.addCompany(company);
    }
    @PutMapping("{id}/admin")//only admin can update a company
    public void UpdateCompany(@PathVariable Integer id, Company company){
    	companyService.updateCompany(id, company);
    }
    @DeleteMapping("{id}/admin")//only admin can delete a company
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