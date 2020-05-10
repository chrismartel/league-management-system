package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.Membership;
import ca.leaguemanagementsystem.model.notifications.Notification;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "User")
@Table(name = "user")
public class User {

    /* associations */

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<UserRole> userRoles;   // roles of the user

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }


    @OneToMany(
            mappedBy = "receiver",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Notification> notifications;   // notifications received by the user

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }


    @OneToMany(
            mappedBy = "member",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Membership> memberships;   // memberships to leagues of the user

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }


    /* attributes */

    private String token;   // authentication token

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    @Id
    private String username;    // unique username

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    private String password;    // log in password

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    private String phoneNumber; // phone number contact to join the user

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String email; // email address to join the user

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private Date birthDate; // birth date of the user

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    private boolean isLoggedIn; // is the user currently logged in or logged out

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }


    private boolean allowNotifications; // setting by which the user decides to allow notifications or not

    public boolean isAllowNotifications() {
        return allowNotifications;
    }

    public void setAllowNotifications(boolean allowNotifications) {
        this.allowNotifications = allowNotifications;
    }






















}
