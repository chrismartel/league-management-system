package ca.leaguemanagementsystem.model.leagues.events.assignments;

<<<<<<< HEAD:LeagueManagementSystem-Backend/src/main/java/ca/leaguemanagementsystem/model/leagues/events/assignments/Assignment.java
import ca.leaguemanagementsystem.model.leagues.events.Game;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "assignment")
public class Assignment {
    @ManyToOne
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    //attributes

    private boolean isAccepted;

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
=======
public class GameAssignment {
>>>>>>> d9c25ae15e8a921b93e237006b1d052b6f4d0a68:LeagueManagementSystem-Backend/src/main/java/ca/leaguemanagementsystem/model/leagues/events/assignments/GameAssignment.java
}
