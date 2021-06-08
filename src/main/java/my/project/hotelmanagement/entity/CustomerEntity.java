package my.project.hotelmanagement.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "person")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personID;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    private String address;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "date")
    private Date birthday;
    private String phone;
    private String email;
    @OneToOne(mappedBy = "customerEntity")
    private CardInforEntity cardInforEntity;
    @OneToMany(mappedBy = "customerEntity")
    private Set<BookingEntity> bookingEntitySet;

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CardInforEntity getCardInforEntity() {
        return cardInforEntity;
    }

    public void setCardInforEntity(CardInforEntity cardInforEntity) {
        this.cardInforEntity = cardInforEntity;
    }

    public Set<BookingEntity> getBookingEntitySet() {
        return bookingEntitySet;
    }

    public void setBookingEntitySet(Set<BookingEntity> bookingEntitySet) {
        this.bookingEntitySet = bookingEntitySet;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "personID=" + personID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", cardInforEntity=" + cardInforEntity +
                ", bookingEntitySet=" + bookingEntitySet +
                '}';
    }
}
