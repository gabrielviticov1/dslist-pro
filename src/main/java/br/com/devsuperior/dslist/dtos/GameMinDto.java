/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package br.com.devsuperior.dslist.dtos;

import br.com.devsuperior.dslist.entities.Game;

/**
 *
 * @author gabrielviticov
 */
public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    
    public GameMinDto() {
        
    }
    
    public GameMinDto(
        Game game
    ) {
        this.setId(game.getId());
        this.setTitle(game.getTitle());
        this.setYear(game.getYear());
        this.setImgUrl(game.getImgUrl());
        this.setShortDescription(game.getShortDescription());
        
    }
    
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getYear() {
        return this.year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getShortDescription() {
        return this.shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
}
