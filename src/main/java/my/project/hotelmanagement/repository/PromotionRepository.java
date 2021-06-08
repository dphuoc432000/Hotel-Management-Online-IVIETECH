package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.PromotionEntity;
import my.project.hotelmanagement.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface PromotionRepository  extends CrudRepository<PromotionEntity,Integer> {
}
