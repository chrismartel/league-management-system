package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.League;

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


    private List<League> managedLeagues;

    @OneToMany(mappedBy = "manager")
    public List<League> getManagedLeagues() {
        return managedLeagues;
    }

    public void setManagedLeagues(List<League> managedLeagues) {
        this.managedLeagues = managedLeagues;
    }
}
