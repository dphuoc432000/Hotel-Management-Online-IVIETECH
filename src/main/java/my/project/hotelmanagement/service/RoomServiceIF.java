package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.RoomEntity;
import my.project.hotelmanagement.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceIF implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    @Override
    public void saveRoom(RoomEntity roomEntity) {
        roomRepository.save(roomEntity);
    }

    @Override
    public void updateRoom(RoomEntity roomEntity) {

    }

    @Override
    public void deleteRoom(RoomEntity roomEntity) {

    }

    @Override
    public List<RoomEntity> getAllRoom() {
        List<RoomEntity> list = (List<RoomEntity>) roomRepository.findAll();
        return list;
    }

    @Override
    public RoomEntity getRoomByID(int id) {
        return null;
    }
}
