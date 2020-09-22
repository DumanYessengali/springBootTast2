package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Request;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Request getRequestBy();
//    List<Request> findAllByRequest_user_id(long a);
//    List<Request> findAll();
}