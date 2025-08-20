
package br.com.devsuperior.dslist.repositories;

import br.com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gabrielviticov
 */
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
