package com.Intesivo.Projeto.dto;

import com.Intesivo.Projeto.entities.Game;

public class GameMinDTO {
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO(){}

    public GameMinDTO(Game entiti) {
        this.id = entiti.getId();
        this.title = entiti.getTitle();
        this.year = entiti.getYear();
        this.imgUrl = entiti.getImgUrl();
        this.shortDescription = entiti.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
