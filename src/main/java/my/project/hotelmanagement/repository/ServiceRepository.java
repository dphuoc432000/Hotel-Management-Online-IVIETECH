package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.ServiceEntity;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<ServiceEntity,Integer> {
}
