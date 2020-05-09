package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.Award;
import ca.leaguemanagementsystem.model.leagues.Team;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "player")
public class Player extends UserRole{
    private Integer rating;
    private String height;

    @OneToMany(mappedBy = "winner")
    private List<Award> awards;

    @OneToMany()
    private List<Team> teams;
}
