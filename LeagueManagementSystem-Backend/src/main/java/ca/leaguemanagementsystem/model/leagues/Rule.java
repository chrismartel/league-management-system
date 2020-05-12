package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;

@Entity
@Table(name = "rule")
public class Rule {

    /* associations */

    @ManyToOne
    private RuleBook ruleBook;

    public RuleBook getRuleBook() {
        return ruleBook;
    }

    public void setRuleBook(RuleBook ruleBook) {
        this.ruleBook = ruleBook;
    }


    /* attributes */

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Id
    @GeneratedValue
    private Integer ruleId; // id for database

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }
}

