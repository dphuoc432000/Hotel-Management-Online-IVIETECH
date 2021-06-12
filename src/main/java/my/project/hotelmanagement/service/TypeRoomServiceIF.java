package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.TypeRoomEntity;
import my.project.hotelmanagement.repository.TypeRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeRoomServiceIF implements TypeRoomService{
    @Autowired
    TypeRoomRepository typeRoomRepository;
    @Override
    public void saveTypeRoom(TypeRoomEntity typeRoomEntity) {
        typeRoomRepository.save(typeRoomEntity);
    }

    @Override
    public List<TypeRoomEntity> getAllTypeRoom() {
        return (List<TypeRoomEntity>) typeRoomRepository.findAll();
    }
}
