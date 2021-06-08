package my.project.hotelmanagement.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "registerService")
public class RegisterServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registerServiceID;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "date")
    private Date regisDate;
    @ManyToOne
    @JoinColumn(name = "serviceID")
    private ServiceEntity serviceEntity;
    @ManyToOne
    @JoinColumn(name = "bookingDetailID")
    private BookingDetailEntity bookingDetailEntity;

    public Integer getRegisterServiceID() {
        return registerServiceID;
    }

    public void setRegisterServiceID(Integer registerServiceID) {
        this.registerServiceID = registerServiceID;
    }

    public Date getRegisDate() {
        return regisDate;
    }

    public void setRegisDate(Date regisDate) {
        this.regisDate = regisDate;
    }

    public ServiceEntity getServiceEntity() {
        return serviceEntity;
    }

    public void setServiceEntity(ServiceEntity serviceEntity) {
        this.serviceEntity = serviceEntity;
    }

    public BookingDetailEntity getBookingDetailEntity() {
        return bookingDetailEntity;
    }

    public void setBookingDetailEntity(BookingDetailEntity bookingDetailEntity) {
        this.bookingDetailEntity = bookingDetailEntity;
    }

    @Override
    public String toString() {
        return "RegisterServiceEntity{" +
                "registerServiceID=" + registerServiceID +
                ", regisDate=" + regisDate +
                ", serviceEntity=" + serviceEntity +
                ", bookingDetailEntity=" + bookingDetailEntity +
                '}';
    }
}
