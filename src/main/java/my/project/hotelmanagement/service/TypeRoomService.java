package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.TypeRoomEntity;

import java.util.List;

public interface TypeRoomService {
    public void saveTypeRoom(TypeRoomEntity typeRoomEntity);
    public List<TypeRoomEntity> getAllTypeRoom();
}
