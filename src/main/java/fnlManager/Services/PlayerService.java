package fnlManager.Services;


import fnlManager.Models.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAll();
    Player findById(int id);
    List<Player> findByTeam();
}
