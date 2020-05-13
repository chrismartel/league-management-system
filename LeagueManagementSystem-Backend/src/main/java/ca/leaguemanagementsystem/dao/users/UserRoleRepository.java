package ca.leaguemanagementsystem.dao.users;

import ca.leaguemanagementsystem.model.users.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<UserRole,Integer> {
}
