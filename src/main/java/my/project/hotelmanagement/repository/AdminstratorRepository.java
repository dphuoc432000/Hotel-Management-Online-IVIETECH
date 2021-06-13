package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.AdminstratorEntity;
import my.project.hotelmanagement.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminstratorRepository  extends CrudRepository<AdminstratorEntity,Integer> {
}
