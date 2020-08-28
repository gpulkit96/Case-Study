package com.stockmarket.companydata.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockmarket.companydata.models.companyfields;

@RestController
@RequestMapping("/company")
public class companyresource {

	@RequestMapping("/{name}")
	public companyfields getCompany(@PathVariable("name") String name) {

		companyfields company = new companyfields(name,100,"Charles","NA","NSE","Commercial",
				"None", "1289");
		return company;
	}
}
