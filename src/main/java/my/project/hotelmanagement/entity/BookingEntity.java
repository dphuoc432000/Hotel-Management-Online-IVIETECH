package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingID;
    @NotNull
    private Date bookingDate;
    @NotNull
    @ManyToOne
    @JoinColumn(name="customerID")
    private CustomerEntity customerEntity;
    @OneToMany(mappedBy = "bookingEntity")
    private Set<BookingDetailEntity> bookingDetailEntitySet;
    @OneToMany(mappedBy = "bookingEntity")
    private  Set<RegisterPromotionEntity> registerPromotionEntitySet;

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public Set<BookingDetailEntity> getBookingDetailEntitySet() {
        return bookingDetailEntitySet;
    }

    public void setBookingDetailEntitySet(Set<BookingDetailEntity> bookingDetailEntitySet) {
        this.bookingDetailEntitySet = bookingDetailEntitySet;
    }

    public Set<RegisterPromotionEntity> getRegisterPromotionEntitySet() {
        return registerPromotionEntitySet;
    }

    public void setRegisterPromotionEntitySet(Set<RegisterPromotionEntity> registerPromotionEntitySet) {
        this.registerPromotionEntitySet = registerPromotionEntitySet;
    }

    @Override
    public String toString() {
        return "BookingEntity{" +
                "bookingID=" + bookingID +
                ", bookingDate=" + bookingDate +
                ", customerEntity=" + customerEntity +
                ", bookingDetailEntitySet=" + bookingDetailEntitySet +
                ", registerPromotionEntitySet=" + registerPromotionEntitySet +
                '}';
    }
}
