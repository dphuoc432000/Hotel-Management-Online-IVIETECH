package my.project.hotelmanagement.entity;

import lombok.Data;

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
    private Double price;
    @NotNull
    private Integer roomNumber;
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

//    @Override
//    public String toString() {
//        return "RoomEntity{" +
//                "roomID=" + roomID +
//                ", roomNumber=" + roomNumber +
//                ", price=" + price +
//                ", size=" + size +
//                ", mainImage='" + mainImage + '\'' +
//                ", subImage1='" + subImage1 + '\'' +
//                ", subImage2='" + subImage2 + '\'' +
//                ", subImage3='" + subImage3 + '\'' +
//                ", description='" + description + '\'' +
//                ", typeRoomEntity=" + typeRoomEntity +
//                ", bookingDetailEntitySet=" + bookingDetailEntitySet +
//                '}';
//    }

//    public RoomEntity(RoomEntityBuilder roomEntityBuilder){
//        this.roomNumber = roomEntityBuilder.roomNumber;
//        this.price = roomEntityBuilder.price;
//        this.size = roomEntityBuilder.size;
//        this.mainImage = roomEntityBuilder.mainImage;
//        this.subImage1 = roomEntityBuilder.subImage1;
//        this.subImage2 = roomEntityBuilder.subImage2;
//        this.subImage3 = roomEntityBuilder.subImage3;
//        this.description = roomEntityBuilder.description;
//        this.typeRoomEntity = roomEntityBuilder.typeRoomEntity;
//    }
//    public RoomEntity(){}
//    public static class RoomEntityBuilder{
//        private final Integer roomNumber;
//        private Double price;
//        private Integer size;
//        private String mainImage;
//        private String subImage1;
//        private String subImage2;
//        private String subImage3;
//        private String description;
//        private TypeRoomEntity typeRoomEntity;
//
//        public RoomEntityBuilder(Integer roomNumber) {
//            this.roomNumber = roomNumber;
//        }
//        public RoomEntityBuilder price(Double price){
//            this.price = price;
//            return this;
//        }
//        public RoomEntityBuilder size(Integer size){
//            this.size = size;
//            return this;
//        }
//        public RoomEntityBuilder mainImage(String mainImage){
//            this.mainImage = mainImage;
//            return this;
//        }
//        public RoomEntityBuilder subImage1( String subImage1){
//            this.subImage1 = subImage1;
//            return this;
//        }
//        public RoomEntityBuilder subImage2(String subImage2){
//            this.subImage2 = subImage2;
//            return this;
//        }
//        public RoomEntityBuilder subImage3(String subImage3){
//            this.subImage3 = subImage3;
//            return this;
//        }
//        public RoomEntityBuilder description(String description){
//            this.description = description;
//            return this;
//        }
//        public RoomEntityBuilder typeRoomEntity(TypeRoomEntity typeRoomEntity){
//            this.typeRoomEntity = typeRoomEntity;
//            return this;
//        }
//        public RoomEntity build(){
//            return new RoomEntity(this);
//        }
//    }
}
