package companydata.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import companydata.entities.Company;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@RequestMapping("/{name}")
	public Company getCompany(@PathVariable("name") String name) {

		Company company = new Company(1,name,"Charles",123,456,789,"NA",
				"None");
		return company;
	}
}
