package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.RegisterServiceEntity;
import my.project.hotelmanagement.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface RegisterServiceRepository  extends CrudRepository<RegisterServiceEntity,Integer> {
}