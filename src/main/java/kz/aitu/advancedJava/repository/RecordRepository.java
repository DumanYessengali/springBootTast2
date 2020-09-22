package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Record;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends CrudRepository<Record,Long> {
//    @Query(value = "select * from fond", nativeQuery = true)
//    Record getRecordBy();
//    List<Record> findAllByCompany_unit_id(long t);
//    List<Record>  findAll();
}
