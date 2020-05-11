package ca.leaguemanagementsystem.model.requests;

import ca.leaguemanagementsystem.model.users.Admin;
import ca.leaguemanagementsystem.model.users.User;

import javax.persistence.*;

@Entity
@DiscriminatorValue("mr")
@Table(name = "manager_Request")
public class ManagerRequest extends Request{

    /* associations */

    @ManyToOne
    private Admin admin;    // manager request sent to the admin

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
