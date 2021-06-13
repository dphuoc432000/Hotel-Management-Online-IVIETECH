package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.ServiceEntity;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<ServiceEntity,Integer> {
//    @Modifying
//    @Query("UPDATE Service s SET s.title = ?1, s.description = ?2, s.unit = ?3, s.price = ?4 WHERE s.serviceid = ?5")
//    void updateService(String title, String description, String unit, double price, int serviceID);
}
