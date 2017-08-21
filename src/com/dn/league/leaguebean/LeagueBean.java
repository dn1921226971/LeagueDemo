package com.dn.league.leaguebean;

public class LeagueBean {
    private int id;
    private int year;
    private String season;
    private String title;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "LeagueBean [id=" + id + ", year=" + year + ", season=" + season + ", title=" + title + "]";
    }
    
    
}
