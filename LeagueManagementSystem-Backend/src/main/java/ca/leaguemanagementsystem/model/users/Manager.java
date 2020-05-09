package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.LeagueType;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "manager")
public class Manager extends UserRole{
    @OneToMany(mappedBy = "manager")
    private List<LeagueType> managedLeagues;
}
