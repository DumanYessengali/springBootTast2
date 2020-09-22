package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Fond;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FondRepository extends CrudRepository<Fond, Long> {
//    @Query(value = "select * from fond", nativeQuery = true)
//    Fond getFond();
//    List<Fond> findAllById(long a);
//    List<Fond>  findAll();

}
