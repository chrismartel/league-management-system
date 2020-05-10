package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rule")
public class Rule {

    @ManyToOne
    private RuleBook ruleBook;

    public RuleBook getRuleBook() {
        return ruleBook;
    }

    public void setRuleBook(RuleBook ruleBook) {
        this.ruleBook = ruleBook;
    }

    //attributes
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

