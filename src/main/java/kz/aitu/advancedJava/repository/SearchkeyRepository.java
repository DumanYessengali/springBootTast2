package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Searchkey;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SearchkeyRepository extends CrudRepository<Searchkey, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Searchkey getSearchKeyBy();
//    List<Searchkey> findAllByCompany_unit_id(long a);
//    List<Searchkey> findAll();
}