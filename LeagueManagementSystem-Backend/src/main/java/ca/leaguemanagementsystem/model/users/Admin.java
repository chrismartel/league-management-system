package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.requests.ManagerRequest;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "admin")
public class Admin {

    /* associations */

    @OneToMany(mappedBy = "admin")
    private List<ManagerRequest> managerRequests;   // manager requests from user

    public List<ManagerRequest> getManagerRequests() {
        return managerRequests;
    }

    public void setManagerRequests(List<ManagerRequest> managerRequests) {
        this.managerRequests = managerRequests;
    }


    /* attributes */
    private String password;            // password of the administrator

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    private String phoneNumber;         // phone Number of the administrator

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    private String email;         // email of the administrator

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private String adminToken;          // administrator authentification token

    public String getAdminToken() {
        return adminToken;
    }

    public void setAdminToken(String adminToken) {
        this.adminToken = adminToken;
    }


    private boolean isLogged;           // if the administrator is logged on

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }


    @Id
    @GeneratedValue
    private Integer adminId;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}
