package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
//    @Query(value = "select * from company", nativeQuery = true)
//    Company getCompanies();
//
//    List<Company> findAllById(long a);
//    List<Company>  findAll();
}
