package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;

@Entity
@Table(name = "rule")
public class Rule {

    /* associations */


    private RuleBook ruleBook;

    @ManyToOne
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



    private Long ruleId; // id for database

    @Id
    @GeneratedValue
    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }
}

