package ca.leaguemanagementsystem.model.leagues.schedules.events.assignments;


import ca.leaguemanagementsystem.model.leagues.schedules.events.Game;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "game_assignment_type")
public class GameAssignment {

    /* associations */

    private Game game;  // assignment to which game

    @ManyToOne
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    /* attributes */

    private boolean isAccepted; // status of the assignment: was is accepted or not

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }



    private Integer gameAssignmentId;

    @Id
    @GeneratedValue
    public Integer getGameAssignmentId() {
        return gameAssignmentId;
    }

    public void setGameAssignmentId(Integer gameAssignmentId) {
        this.gameAssignmentId = gameAssignmentId;
    }
}
