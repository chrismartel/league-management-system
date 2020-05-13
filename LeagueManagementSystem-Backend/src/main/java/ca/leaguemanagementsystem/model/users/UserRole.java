package ca.leaguemanagementsystem.model.users;

import javax.persistence.*;
import java.sql.Date;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "user_role_type")
public class UserRole {

    /* associations */

    private AppUser appUser;  // user to which the role beLongs

    @ManyToOne
    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }


    /* attributes */

    private Long userRoleId;    // Id for database

    @Id
    @GeneratedValue
    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }


    private Date date;  // date of role creation

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
