package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomEntity,Integer> {
}
