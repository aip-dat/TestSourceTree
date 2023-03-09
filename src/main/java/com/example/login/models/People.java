package com.example.login.models;

public class People {
    private String name;
    private String country;
    private String level;
    private String[] identity;
    private String[] favorite;

    public People() {
    }

    public People(String name, String country, String level, String[] identity, String[] favorite) {
        this.name = name;
        this.country = country;
        this.level = level;
        this.identity = identity;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String[] getIdentity() {
        return identity;
    }

    public void setIdentity(String[] identity) {
        this.identity = identity;
    }

    public String[] getFavorite() {
        return favorite;
    }

    public void setFavorite(String[] favorite) {
        this.favorite = favorite;
    }
}
