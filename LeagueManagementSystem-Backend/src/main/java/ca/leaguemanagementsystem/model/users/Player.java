package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.schedules.Award;
import ca.leaguemanagementsystem.model.leagues.schedules.PlayerTeamAssignment;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@DiscriminatorValue("ply")
@Table(name = "player")
public class Player extends UserRole{

    /* associations */

    @OneToMany(mappedBy = "winner")
    private List<Award> awards; // awards won

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }


    @OneToMany(mappedBy = "player")
    private List<PlayerTeamAssignment> assignedTeams; // teams assigned

    public List<PlayerTeamAssignment> getAssignedTeams() {
        return assignedTeams;
    }

    public void setAssignedTeams(List<PlayerTeamAssignment> assignedTeams) {
        this.assignedTeams = assignedTeams;
    }

    /* attributes */

    private Integer rating; // overall rating based on career stats

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


    private String height;  // height of player

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
