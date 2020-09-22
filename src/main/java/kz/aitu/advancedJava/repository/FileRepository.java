package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.File;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepository extends CrudRepository<File, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    File getFileBy();
//    List<File> findAllBySize(long a);
//    List<File> findAll();
}