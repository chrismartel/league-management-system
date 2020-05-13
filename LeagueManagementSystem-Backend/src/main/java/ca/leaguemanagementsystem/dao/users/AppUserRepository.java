package ca.leaguemanagementsystem.dao.users;

import ca.leaguemanagementsystem.model.users.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser, String> {
}
