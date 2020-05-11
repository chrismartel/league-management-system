package ca.leaguemanagementsystem.model.users;

import javax.persistence.*;
import java.util.Date;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "user_role_type")
public class UserRole {

    /* associations */

    private User user;  // user to which the role belongs

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private long userRoleId;    // Id for database

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
