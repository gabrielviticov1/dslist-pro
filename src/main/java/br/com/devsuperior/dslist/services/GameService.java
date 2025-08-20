
package br.com.devsuperior.dslist.services;

import br.com.devsuperior.dslist.dtos.GameMinDto;
import br.com.devsuperior.dslist.entities.Game;
import br.com.devsuperior.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielviticov
 */
@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }
}
