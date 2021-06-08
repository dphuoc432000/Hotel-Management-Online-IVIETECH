package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name="service")
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceID;
    @NotNull
    private String  title;
    @Column(columnDefinition = "text")
    private String description;
    private String unit;
    @NotNull
    private Double price;
    @OneToMany(mappedBy = "serviceEntity")
    private Set<RegisterServiceEntity> registerServiceEntitySet;

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<RegisterServiceEntity> getRegisterServiceEntitySet() {
        return registerServiceEntitySet;
    }

    public void setRegisterServiceEntitySet(Set<RegisterServiceEntity> registerServiceEntitySet) {
        this.registerServiceEntitySet = registerServiceEntitySet;
    }

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "serviceID=" + serviceID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", registerServiceEntitySet=" + registerServiceEntitySet +
                '}';
    }
}
