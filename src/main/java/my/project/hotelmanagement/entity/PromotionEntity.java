package my.project.hotelmanagement.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.Set;

@Entity
public class PromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer promotionID;
    @NotNull
    private String promotionName;
    @Null
    private String description;
    @NotNull
    private Double discount;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "date")
    private Date startDate;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "date")
    private Date endDate;
    @OneToMany(mappedBy = "promotionEntity")
    private Set<RegisterPromotionEntity> registerPromotionEntitySet;

    public Integer getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(Integer promotionID) {
        this.promotionID = promotionID;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public Set<RegisterPromotionEntity> getRegisterPromotionEntitySet() {
        return registerPromotionEntitySet;
    }

    public void setRegisterPromotionEntitySet(Set<RegisterPromotionEntity> registerPromotionEntitySet) {
        this.registerPromotionEntitySet = registerPromotionEntitySet;
    }

    @Override
    public String toString() {
        return "PromotionEntity{" +
                "promotionID=" + promotionID +
                ", promotionName='" + promotionName + '\'' +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", registerPromotionEntitySet=" + registerPromotionEntitySet +
                '}';
    }
}
