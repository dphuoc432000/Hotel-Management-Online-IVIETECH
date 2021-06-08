package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleID;
    @NotNull
    private String roleName;
    @OneToOne(mappedBy = "roleEntity")
    private AccountEntity accountEntity;

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public AccountEntity getAccountEntity() {
        return accountEntity;
    }

    public void setAccountEntity(AccountEntity accountEntity) {
        this.accountEntity = accountEntity;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                ", accountEntity=" + accountEntity +
                '}';
    }
}
