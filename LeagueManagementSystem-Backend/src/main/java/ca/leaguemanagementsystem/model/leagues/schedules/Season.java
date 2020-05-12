package ca.leaguemanagementsystem.model.leagues.schedules;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("ssn")
@Table(name = "season")
public class Season extends Schedule {

    /* associations */

    @OneToMany(
            mappedBy = "season",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Award> awards; // season awards

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }


    @OneToOne
    private Playoff playoff;    // playoff schedule of the season

    public Playoff getPlayoff() {
        return playoff;
    }

    public void setPlayoff(Playoff playoff) {
        this.playoff = playoff;
    }


    @OneToMany(
            mappedBy = "teamSeason",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }


    /* attributes */

    private Integer price;  // price for the season

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    private boolean isActive;   // is the season currently active

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
