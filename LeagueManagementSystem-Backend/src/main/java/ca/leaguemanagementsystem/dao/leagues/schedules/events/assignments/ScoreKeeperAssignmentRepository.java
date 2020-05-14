package ca.leaguemanagementsystem.dao.leagues.schedules.events.assignments;

import ca.leaguemanagementsystem.model.leagues.schedules.events.assignments.ScoreKeeperAssignment;
import ca.leaguemanagementsystem.model.users.ScoreKeeper;

import java.util.List;

public interface ScoreKeeperAssignmentRepository extends GameAssignmentRepository{
    List<ScoreKeeperAssignment> findByScoreKeeper(ScoreKeeper scoreKeeper);
}
