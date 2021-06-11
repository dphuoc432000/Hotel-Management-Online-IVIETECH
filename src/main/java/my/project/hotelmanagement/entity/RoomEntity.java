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
    private String mainImage;
    private String subImage1;
    private String subImage2;
    private String subImage3;
    private String description;
    @ManyToOne
    @JoinColumn(name="typeRoomID")
    private TypeRoomEntity typeRoomEntity;
    @OneToMany(mappedBy = "roomEntity")
    private Set<BookingDetailEntity> bookingDetailEntitySet;

    public String getSubImage1() {
        return subImage1;
    }

    public void setSubImage1(String subImage1) {
        this.subImage1 = subImage1;
    }

    public String getSubImage2() {
        return subImage2;
    }

    public void setSubImage2(String subImage2) {
        this.subImage2 = subImage2;
    }

    public String getSubImage3() {
        return subImage3;
    }

    public void setSubImage3(String subImage3) {
        this.subImage3 = subImage3;
    }

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

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
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
                ", mainImage='" + mainImage + '\'' +
                ", subImage1='" + subImage1 + '\'' +
                ", subImage2='" + subImage2 + '\'' +
                ", subImage3='" + subImage3 + '\'' +
                ", description='" + description + '\'' +
                ", typeRoomEntity=" + typeRoomEntity +
                ", bookingDetailEntitySet=" + bookingDetailEntitySet +
                '}';
    }
}
