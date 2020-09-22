package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.FileRouting;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRoutingRepository extends CrudRepository<FileRouting, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    FileRouting getFileRoutingBy();
//
//    List<FileRouting> findAllByFileId(long a);
//
//    List<FileRouting> findAll();
}