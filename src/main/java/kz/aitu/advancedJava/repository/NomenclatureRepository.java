package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Nomenclature;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NomenclatureRepository extends CrudRepository<Nomenclature, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Nomenclature getAuthBy();
//    List<Nomenclature> findAllByCompany_unit_id(long a);
//    List<Nomenclature> findAll();
}

