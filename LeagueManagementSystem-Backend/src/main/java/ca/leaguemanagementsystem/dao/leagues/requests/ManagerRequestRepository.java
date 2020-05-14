package ca.leaguemanagementsystem.dao.leagues.requests;

import ca.leaguemanagementsystem.model.leagues.requests.ManagerRequest;
import ca.leaguemanagementsystem.model.leagues.requests.Request;
import ca.leaguemanagementsystem.model.users.Admin;

import java.util.List;

public interface ManagerRequestRepository extends RequestRepository{
    List<ManagerRequest> findByAdmin(Admin admin);
}
