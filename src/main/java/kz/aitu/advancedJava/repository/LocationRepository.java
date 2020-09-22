package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Location;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Location getLocationBy();
//    List<Location> findAllByCompany_unit_id(long a);
//    List<Location> findAll();
}