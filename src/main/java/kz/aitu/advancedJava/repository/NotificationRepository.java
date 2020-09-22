package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Notification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {
//    @Query(value = "select * from users", nativeQuery = true)
//    Notification getNotificationBy();
//    List<Notification> findAllByObjectId(long a);
//    List<Notification> findAll();
}