package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.PromotionEntity;
import my.project.hotelmanagement.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository  extends CrudRepository<PromotionEntity,Integer> {
}
