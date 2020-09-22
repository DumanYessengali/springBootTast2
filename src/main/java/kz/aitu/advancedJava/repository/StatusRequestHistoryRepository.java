package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.StatusRequestHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StatusRequestHistoryRepository extends CrudRepository<StatusRequestHistory, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    StatusRequestHistory getStatusRequestHistoryBy();
//    List<StatusRequestHistory> findAllByRequest_id(long a);
//    List<StatusRequestHistory> findAll();
}