package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleEntity,Integer> {
}
