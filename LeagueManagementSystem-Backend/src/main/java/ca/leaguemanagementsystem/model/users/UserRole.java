package ca.leaguemanagementsystem.model.users;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class UserRole {
    @Id
    @GeneratedValue
    private long userRoleId;

}
