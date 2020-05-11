package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("plyf")
@Table(name = "playoff")
public class Playoff extends Schedule{

    /* associations */

    @OneToOne(mappedBy = "playoffSchedule",
                optional = false)
    private Season season;  // playoff schedule following the season

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
