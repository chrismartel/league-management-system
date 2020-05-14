package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.League;
import ca.leaguemanagementsystem.model.leagues.Membership;
import ca.leaguemanagementsystem.model.users.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MembershipRepository extends CrudRepository<Membership, Long> {
    Membership findByMembershipId(Long membershipId);
    List<Membership> findByLeague(League league);
    List<Membership> findByMember(AppUser member);
}
