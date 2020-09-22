package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.DestructionAct;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestructionActRepository extends CrudRepository<DestructionAct, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    DestructionAct getDestructionActBy();
//    List<DestructionAct> findAllByStructural_subdivision_id(long a);
//    List<DestructionAct> findAll();
}