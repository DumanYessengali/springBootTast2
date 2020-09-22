package kz.aitu.advancedJava.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import kz.aitu.advancedJava.model.Users;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Users getUsersBy();
//    List<Users> findAllByAuthId(long u);
//    List<Users> findAll();
}
