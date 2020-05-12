package ca.leaguemanagementsystem.model.users;

import javax.persistence.*;
import java.sql.Date;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "user_role_type")
public class UserRole {

    /* associations */

    private AppUser appUser;  // user to which the role belongs

    @ManyToOne
    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }


    /* attributes */

    private long userRoleId;    // Id for database

    @Id
    @GeneratedValue
    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
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
