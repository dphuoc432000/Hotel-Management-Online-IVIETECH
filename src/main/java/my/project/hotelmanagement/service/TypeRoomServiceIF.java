package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.RoomEntity;
import my.project.hotelmanagement.entity.TypeRoomEntity;
import my.project.hotelmanagement.repository.RoomRepository;
import my.project.hotelmanagement.repository.TypeRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeRoomServiceIF implements TypeRoomService{
    @Autowired
    TypeRoomRepository typeRoomRepository;
    @Autowired
    RoomRepository roomRepository;
    @Override
    public void saveTypeRoom(TypeRoomEntity typeRoomEntity) {
        typeRoomRepository.save(typeRoomEntity);
    }

    @Override
    public List<TypeRoomEntity> getAllTypeRoom() {
        return (List<TypeRoomEntity>) typeRoomRepository.findAll();
    }
    @Override
    public TypeRoomEntity getTypeRoomByRoomID(int id){
        List<RoomEntity> list = roomRepository.getTypeRoomByRoomID(id);
        int typeRoomByRoomID = list.get(0).getTypeRoomEntity().getTypeRoomID();
        Optional<TypeRoomEntity> opt =  typeRoomRepository.findById(typeRoomByRoomID);
        return opt.isPresent()? opt.get() : null;
    }
}
