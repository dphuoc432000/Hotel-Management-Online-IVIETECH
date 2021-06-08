package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.AdminstratorEntity;
import my.project.hotelmanagement.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdminstratorRepository  extends CrudRepository<AdminstratorEntity,Integer> {
}
