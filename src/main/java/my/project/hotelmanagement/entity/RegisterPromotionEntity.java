package my.project.hotelmanagement.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.Date;

@Entity
public class RegisterPromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registerPromotionID;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "date")
    private Date registerPromtionDate;
    @ManyToOne
    @JoinColumn(name = "promotionID")
    private PromotionEntity promotionEntity;
    @ManyToOne
    @JoinColumn(name = "bookingID")
    private  BookingEntity bookingEntity;

    public Integer getRegisterPromotionID() {
        return registerPromotionID;
    }

    public void setRegisterPromotionID(Integer registerPromotionID) {
        this.registerPromotionID = registerPromotionID;
    }

    public Date getRegisterPromtionDate() {
        return registerPromtionDate;
    }

    public void setRegisterPromtionDate(Date registerPromtionDate) {
        this.registerPromtionDate = registerPromtionDate;
    }

    public PromotionEntity getPromotionEntity() {
        return promotionEntity;
    }

    public void setPromotionEntity(PromotionEntity promotionEntity) {
        this.promotionEntity = promotionEntity;
    }

    public BookingEntity getBookingEntity() {
        return bookingEntity;
    }

    public void setBookingEntity(BookingEntity bookingEntity) {
        this.bookingEntity = bookingEntity;
    }

    @Override
    public String toString() {
        return "RegisterPromotionEntity{" +
                "registerPromotionID=" + registerPromotionID +
                ", registerPromtionDate=" + registerPromtionDate +
                ", promotionEntity=" + promotionEntity +
                ", bookingEntity=" + bookingEntity +
                '}';
    }
}
