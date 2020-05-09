package ca.leaguemanagementsystem.model.users;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "user_role_type")
public class UserRole {
    @Id
    @GeneratedValue
    private long userRoleId;

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }
}
