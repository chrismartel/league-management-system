package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("pcklgue")
@Table(name = "pickUpLeague")
public class PickUpLeague extends LeagueType{

    @Id
    private String scheduleName;
    //attributes
    private Integer minNbPlayers;
    private Integer maxNbPlayers;
    private ScheduleType scheduleType;

    public Integer getMinNbPlayers() {
        return minNbPlayers;
    }

    public void setMinNbPlayers(Integer minNbPlayers) {
        this.minNbPlayers = minNbPlayers;
    }

    public Integer getMaxNbPlayers() {
        return maxNbPlayers;
    }

    public void setMaxNbPlayers(Integer maxNbPlayers) {
        this.maxNbPlayers = maxNbPlayers;
    }

    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }
}

