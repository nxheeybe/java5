package com.example.pract5;

public class FootballClub {
    private String name;
    private String stadium;
    private String coach;
    private String foundedYear;

    public FootballClub(String name, String stadium, String coach, String Yearfounded) {
        this.name = name;
        this.stadium = stadium;
        this.coach = coach;
        this.foundedYear = Yearfounded;
    }
    public String getName() {
        return name;
    }

    public String getStadium() {
        return stadium;
    }

    public String getCoach() {
        return coach;
    }

    public String getFoundedYear() {
        return foundedYear;
    }
}