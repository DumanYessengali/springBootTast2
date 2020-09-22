package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.CompanyUnit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyUnitRepository extends CrudRepository<CompanyUnit, Long> {
//    @Query(value = "select * from company_unit", nativeQuery = true)
//    CompanyUnit getCompanyUnit();
//
//    List<CompanyUnit> findAllById(long c);
//
//    List<CompanyUnit> findAll();
}
