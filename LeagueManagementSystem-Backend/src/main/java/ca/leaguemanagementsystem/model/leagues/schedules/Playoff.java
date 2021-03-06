package ca.leaguemanagementsystem.model.leagues.schedules;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("plyf")
@Table(name = "playoff")
public class Playoff extends Schedule {

    /* associations */


    private Season season;  // playoff schedule following the season

    @OneToOne(
            optional = false
    )
    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
