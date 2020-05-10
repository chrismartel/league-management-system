package ca.leaguemanagementsystem.model.requests;

import ca.leaguemanagementsystem.model.users.Admin;
import ca.leaguemanagementsystem.model.users.User;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "manager_Request")
public class ManagerRequest extends Request{

    /* associations */

    @ManyToOne
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @OneToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
