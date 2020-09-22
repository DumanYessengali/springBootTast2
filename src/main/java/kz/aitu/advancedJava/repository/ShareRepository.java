package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Share;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareRepository extends CrudRepository<Share, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Share getShareBy();
//    List<Share> findAllByRequest_id(long a);
//    List<Share> findAll();
}