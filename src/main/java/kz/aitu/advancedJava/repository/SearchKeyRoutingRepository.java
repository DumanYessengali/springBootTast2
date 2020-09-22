package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.SearchKeyRouting;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchKeyRoutingRepository extends CrudRepository<SearchKeyRouting, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    SearchKeyRouting getSearchKeyRoutingBy();
//    List<SearchKeyRouting> findAllBySearch_key_id(long a);
//    List<SearchKeyRouting> findAll();
}