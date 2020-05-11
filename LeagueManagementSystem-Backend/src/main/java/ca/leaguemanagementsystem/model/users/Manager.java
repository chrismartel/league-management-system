package ca.leaguemanagementsystem.model.users;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@DiscriminatorValue("mng")
@Table(name = "manager")
public class Manager extends UserRole{
    
    /* associations */

    @OneToMany(mappedBy = "manager")
    private List<LeagueType> managedLeagues;

    public List<LeagueType> getManagedLeagues() {
        return managedLeagues;
    }

    public void setManagedLeagues(List<LeagueType> managedLeagues) {
        this.managedLeagues = managedLeagues;
    }
}
