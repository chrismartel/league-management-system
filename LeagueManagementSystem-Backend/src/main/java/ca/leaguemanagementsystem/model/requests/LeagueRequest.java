package ca.leaguemanagementsystem.model.requests;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.net.Authenticator;

@Entity
@DiscriminatorValue("lr")
@Table(name = "league_request")
public class LeagueRequest extends Request{

    /* associations */

}
