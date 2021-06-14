package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "typeRoom")
public class TypeRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeRoomID;
    @NotNull
    private String typeRoomName;
    @OneToMany(mappedBy = "typeRoomEntity")
    private Set<RoomEntity> roomEntitySet;

    public Integer getTypeRoomID() {
        return typeRoomID;
    }

    public void setTypeRoomID(Integer typeRoomID) {
        this.typeRoomID = typeRoomID;
    }

    public String getTypeRoomName() {
        return typeRoomName;
    }

    public void setTypeRoomName(String typeRoomName) {
        this.typeRoomName = typeRoomName;
    }

    public Set<RoomEntity> getRoomEntitySet() {
        return roomEntitySet;
    }

    public void setRoomEntitySet(Set<RoomEntity> roomEntitySet) {
        this.roomEntitySet = roomEntitySet;
    }

//    @Override
//    public String toString() {
//        return "TypeRoomEntity{" +
//                "typeRoomID=" + typeRoomID +
//                ", typeRoomName='" + typeRoomName + '\'' +
//                ", roomEntitySet=" + roomEntitySet +
//                '}';
//    }
}
