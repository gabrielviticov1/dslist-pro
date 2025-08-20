package br.com.devsuperior.dslist.controller;

import br.com.devsuperior.dslist.dtos.GameMinDto;
import br.com.devsuperior.dslist.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabrielviticov
 */
@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<GameMinDto> onGet() {
        return gameService.findAll();
    }
}
