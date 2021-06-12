package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.RoomEntity;

import java.util.List;

public interface RoomService {
    public void saveRoom(RoomEntity roomEntity);
    public void updateRoom(RoomEntity roomEntity);
    public void deleteRoom(RoomEntity roomEntity);
    public List<RoomEntity> getAllRoom();
    public  RoomEntity getRoomByID(int id);
}
