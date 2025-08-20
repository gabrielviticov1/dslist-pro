/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.devsuperior.dslist.repositories;

import br.com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gabrielviticov
 */
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
