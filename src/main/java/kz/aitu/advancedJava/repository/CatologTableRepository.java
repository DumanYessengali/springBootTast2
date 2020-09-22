package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.CatologTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatologTableRepository extends CrudRepository<CatologTable, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    CatologTable getCatologTableBy();
//    List<CatologTable> findAllByCompany_unit_id(long a);
//    List<CatologTable> findAll();
}