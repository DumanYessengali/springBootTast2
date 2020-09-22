package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.CaseTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CaseTableRepository extends CrudRepository<CaseTable, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    CaseTable getCaseTableBy();
//    List<CaseTable> findAllByLocationId(long a);
//    List<CaseTable> findAll();
}