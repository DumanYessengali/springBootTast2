package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Tepfiles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TepfilesRepository extends CrudRepository<Tepfiles, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Tepfiles getTepfilesBy();
//    List<Tepfiles> findAllById(long a);
//    List<Tepfiles> findAll();
}