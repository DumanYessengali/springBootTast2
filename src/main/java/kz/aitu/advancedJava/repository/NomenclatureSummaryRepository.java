package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.NomenclatureSummary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NomenclatureSummaryRepository extends CrudRepository<NomenclatureSummary, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    NomenclatureSummary getNomenclatureSummaryBy();
//    List<NomenclatureSummary> findAllByCompany_unit_id(long a);
//    List<NomenclatureSummary> findAll();
}