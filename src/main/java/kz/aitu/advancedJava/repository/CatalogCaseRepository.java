package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.CatalogCase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogCaseRepository extends CrudRepository<CatalogCase, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    CatalogCase getCatalogCaseBy();
//    List<CatalogCase> findAllByCaseId(long a);
//    List<CatalogCase> findAll();
}