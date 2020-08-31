package companydata.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import companydata.entities.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer>{
}
