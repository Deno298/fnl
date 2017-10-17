package fnlManager.Services;

import fnlManager.Models.Team;

import java.util.List;

public interface TeamService {

    List<Team> getAllTeams();
    Team findById();
}
