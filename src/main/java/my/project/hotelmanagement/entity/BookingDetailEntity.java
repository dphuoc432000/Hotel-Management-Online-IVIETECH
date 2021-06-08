package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "bookingDetail")
public class BookingDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingDetailID;
    @NotNull
    private Date startDate;
    @NotNull
    private Date endDate;
    private Integer numberOfAudult;
    private Integer numberOfChild;
    @ManyToOne
    @JoinColumn(name="roomID")
    private RoomEntity roomEntity;
    @ManyToOne
    @JoinColumn(name = "bookingID")
    private BookingEntity bookingEntity;

    public Integer getBookingDetailID() {
        return bookingDetailID;
    }

    public void setBookingDetailID(Integer bookingDetailID) {
        this.bookingDetailID = bookingDetailID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getNumberOfAudult() {
        return numberOfAudult;
    }

    public void setNumberOfAudult(Integer numberOfAudult) {
        this.numberOfAudult = numberOfAudult;
    }

    public Integer getNumberOfChild() {
        return numberOfChild;
    }

    public void setNumberOfChild(Integer numberOfChild) {
        this.numberOfChild = numberOfChild;
    }

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    public BookingEntity getBookingEntity() {
        return bookingEntity;
    }

    public void setBookingEntity(BookingEntity bookingEntity) {
        this.bookingEntity = bookingEntity;
    }

    @Override
    public String toString() {
        return "BookingDetailEntity{" +
                "bookingDetailID=" + bookingDetailID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", numberOfAudult=" + numberOfAudult +
                ", numberOfChild=" + numberOfChild +
                ", romEntity=" + roomEntity +
                ", bookingEntity=" + bookingEntity +
                '}';
    }
}
