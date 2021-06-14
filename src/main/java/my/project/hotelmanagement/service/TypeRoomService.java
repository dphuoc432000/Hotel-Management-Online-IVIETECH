package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.TypeRoomEntity;

import java.util.List;

public interface TypeRoomService {
    public void saveTypeRoom(TypeRoomEntity typeRoomEntity);
    public List<TypeRoomEntity> getAllTypeRoom();
    public TypeRoomEntity getTypeRoomByID(int id);
    public TypeRoomEntity getTypeRoomByRoomID(int id);
    public void deleteTypeRoom(TypeRoomEntity typeRoomEntity);
    public TypeRoomEntity upadteTypeRoom(TypeRoomEntity typeRoomEntity);
}
