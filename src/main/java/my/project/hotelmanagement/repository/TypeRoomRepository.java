package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.TypeRoomEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRoomRepository extends CrudRepository<TypeRoomEntity,Integer> {
}
