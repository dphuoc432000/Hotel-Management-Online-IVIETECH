package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "room")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomID;
    @NotNull
    private Integer roomNumber;
    @NotNull
    private Double price;
    @NotNull
    private Integer size;
    private String pictures;
    private String description;
    @ManyToOne
    @JoinColumn(name="typeRoomID")
    private TypeRoomEntity typeRoomEntity;
    @OneToMany(mappedBy = "roomEntity")
    private Set<BookingDetailEntity> bookingDetailEntitySet;

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeRoomEntity getTypeRoomEntity() {
        return typeRoomEntity;
    }

    public void setTypeRoomEntity(TypeRoomEntity typeRoomEntity) {
        this.typeRoomEntity = typeRoomEntity;
    }

    public Set<BookingDetailEntity> getBookingDetailEntitySet() {
        return bookingDetailEntitySet;
    }

    public void setBookingDetailEntitySet(Set<BookingDetailEntity> bookingDetailEntitySet) {
        this.bookingDetailEntitySet = bookingDetailEntitySet;
    }

    @Override
    public String toString() {
        return "RoomEntity{" +
                "roomID=" + roomID +
                ", roomNumber=" + roomNumber +
                ", price=" + price +
                ", size=" + size +
                ", pictures='" + pictures + '\'' +
                ", description='" + description + '\'' +
                ", typeRoomEntity=" + typeRoomEntity +
                ", bookingDetailEntitySet=" + bookingDetailEntitySet +
                '}';
    }
}
