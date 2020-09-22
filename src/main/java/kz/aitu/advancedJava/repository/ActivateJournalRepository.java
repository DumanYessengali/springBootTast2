package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.ActivateJournal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivateJournalRepository extends CrudRepository<ActivateJournal, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    ActivateJournal getActivateJournalBy();
//
//    List<ActivateJournal> findAllByObjectId(long a);
//
//    List<ActivateJournal> findAll();
}