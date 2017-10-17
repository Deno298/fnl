package fnlManager.Services;


import fnlManager.Models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> getAll() {
        List<Player> allPlayers = new ArrayList<>(playerRepository.findAll());
        return allPlayers;
    }

    @Override
    public Player findById(int id) {
        return playerRepository.findOne(id);
    }

    @Override
    public List<Player> findByTeam() {
        return null;
    }
}
