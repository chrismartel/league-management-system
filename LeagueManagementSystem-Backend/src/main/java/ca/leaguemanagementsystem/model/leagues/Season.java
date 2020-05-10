package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("ssn")
@Table(name = "season")
public class Season extends ScheduleType{

    @OneToOne
    private Playoff playoff;

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

    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
