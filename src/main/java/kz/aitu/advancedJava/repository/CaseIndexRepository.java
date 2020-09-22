package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.CaseIndex;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CaseIndexRepository extends CrudRepository<CaseIndex, Long> {
//    @Query(value = "select * from fond", nativeQuery = true)
//    CaseIndex getCaseIndexBy();
//
//    List<CaseIndex> findAllByCompany_unit_id(long c);
//
//    List<CaseIndex> findAll();
}
