package ca.leaguemanagementsystem.dao.users;

import ca.leaguemanagementsystem.model.users.AppUser;
import ca.leaguemanagementsystem.model.users.UserRole;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRoleRepository extends CrudRepository<UserRole,Long> {
    UserRole findByUserRoleId(Long userRoleId);
    List<UserRole> findByAppUser(AppUser appUser);
}
