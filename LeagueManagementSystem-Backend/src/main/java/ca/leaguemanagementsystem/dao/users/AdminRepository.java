package ca.leaguemanagementsystem.dao.users;

import ca.leaguemanagementsystem.model.users.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin,Integer> {
}
