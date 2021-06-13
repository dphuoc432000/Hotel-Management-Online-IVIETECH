package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.RoomEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity,Integer> {
    @Query("SELECT r.type_roomid FROM Room r WHERE r.roomid = ?1")
    List<RoomEntity> getTypeRoomByRoomID(int roomID);
}
