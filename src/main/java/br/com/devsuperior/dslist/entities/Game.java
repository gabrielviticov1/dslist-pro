/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author gabrielviticov
 */
@Entity
@Table(name = "tb_game")
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    
    @Column(columnDefinition = "TEXT")
    private String longDescription;
    
    public Game() {
    }
    
    public Game(
        Long id, 
        String title, 
        Integer year, 
        String genre, 
        String platforms, 
        Double score, 
        String imgUrl, 
        String shortDescription, 
        String longDescription
    ) {
        this.setId(id);
        this.setTitle(title);
        this.setYear(year);
        this.setGenre(genre);
        this.setPlatforms(platforms);
        this.setScore(score);
        this.setImgUrl(imgUrl);
        this.setShortDescription(shortDescription);
        this.setLongDescription(longDescription);
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
    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPlatforms() {
        return this.platforms;
    }
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }
    public Double getScore() {
        return this.score;
    }
    public void setScore(Double score) {
        this.score = score;
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
    public String getLongDescription() {
        return this.longDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        return true;
    }

    
}
