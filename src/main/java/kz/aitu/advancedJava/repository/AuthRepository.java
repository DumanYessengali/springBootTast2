package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Auth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AuthRepository extends CrudRepository<Auth, Long>{
//    @Query(value = "select * from users", nativeQuery = true)
//    Auth getAuthBy();
//    List<Auth> findAllByCompany_unit_id(long a);
//    List<Auth> findAll();
}

