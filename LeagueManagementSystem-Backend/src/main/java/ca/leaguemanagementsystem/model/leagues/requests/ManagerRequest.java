package ca.leaguemanagementsystem.model.leagues.requests;

import ca.leaguemanagementsystem.model.users.Admin;

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
