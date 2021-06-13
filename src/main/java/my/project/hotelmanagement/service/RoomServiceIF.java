package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.RoomEntity;
import my.project.hotelmanagement.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceIF implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    @Override
    public RoomEntity saveRoom(RoomEntity roomEntity) {
        return roomRepository.save(roomEntity);
    }

    @Override
    public RoomEntity updateRoom(RoomEntity roomEntity) {
        return roomRepository.save(roomEntity);
    }

    @Override
    public void deleteRoom(RoomEntity roomEntity) {
        roomRepository.delete(roomEntity);
    }

    @Override
    public List<RoomEntity> getAllRoom() {
        List<RoomEntity> list = (List<RoomEntity>) roomRepository.findAll();
        return list;
    }

    @Override
    public RoomEntity getRoomByID(int id) {
        Optional<RoomEntity> opt = roomRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        return  null;
    }
}
