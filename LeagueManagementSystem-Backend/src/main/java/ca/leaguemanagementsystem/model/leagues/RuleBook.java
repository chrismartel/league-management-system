package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ruleBook")
public class RuleBook {
    @OneToOne(mappedBy = "ruleBook")
    private CompetitiveLeague competitiveLeague;

    public CompetitiveLeague getCompetitiveLeague() {
        return competitiveLeague;
    }

    public void setCompetitiveLeague(CompetitiveLeague competitiveLeague) {
        this.competitiveLeague = competitiveLeague;
    }

    @OneToMany(
            mappedBy = "ruling",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Rule> rules;

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
