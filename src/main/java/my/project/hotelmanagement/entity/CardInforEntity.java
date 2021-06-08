package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "cartinfor")
public class CardInforEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardID;
    @NotNull
    private String cardNumber;
    @NotNull
    private String bankName;
    @NotNull
    private Double amount;
    private String cardType;
    @OneToOne
    @JoinColumn(name = "customerID")
    private CustomerEntity customerEntity;

    public Integer getCardID() {
        return cardID;
    }

    public void setCardID(Integer cardID) {
        this.cardID = cardID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    @Override
    public String toString() {
        return "CardInforEntity{" +
                "cardID=" + cardID +
                ", cardNumber='" + cardNumber + '\'' +
                ", bankName='" + bankName + '\'' +
                ", amount=" + amount +
                ", cardType='" + cardType + '\'' +
                ", customerEntity=" + customerEntity +
                '}';
    }
}
