package my.project.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountID;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @OneToOne
    @NotNull
    @JoinColumn(name = "adminID")
    private AdminstratorEntity adminstratorEntity;
    @OneToOne
    @NotNull
    @JoinColumn(name = "roleID")
    private RoleEntity roleEntity;

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdminstratorEntity getAdminstratorEntity() {
        return adminstratorEntity;
    }

    public void setAdminstratorEntity(AdminstratorEntity adminstratorEntity) {
        this.adminstratorEntity = adminstratorEntity;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "accountID=" + accountID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", adminstratorEntity=" + adminstratorEntity +
                ", roleEntity=" + roleEntity +
                '}';
    }
}
