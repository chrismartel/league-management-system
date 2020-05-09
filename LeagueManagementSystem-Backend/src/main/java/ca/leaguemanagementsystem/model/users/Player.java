package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.Award;
import ca.leaguemanagementsystem.model.leagues.Team;
import ca.leaguemanagementsystem.model.leagues.TeamAssignment;

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

    @OneToMany(mappedBy = "player")
    private List<TeamAssignment> assignedTeams;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public List<TeamAssignment> getAssignedTeams() {
        return assignedTeams;
    }

    public void setAssignedTeams(List<TeamAssignment> assignedTeams) {
        this.assignedTeams = assignedTeams;
    }
}
