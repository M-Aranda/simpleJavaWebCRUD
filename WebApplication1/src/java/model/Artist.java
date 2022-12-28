/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Chelo
 */
public class Artist {
    private int id;
    private String artist_name;
    private String most_popular_song;
    private String most_popular_member;

    public Artist() {
    }

    public Artist(int id, String artist_name, String most_popular_song, String most_popular_member) {
        this.id = id;
        this.artist_name = artist_name;
        this.most_popular_song = most_popular_song;
        this.most_popular_member = most_popular_member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getMost_popular_song() {
        return most_popular_song;
    }

    public void setMost_popular_song(String most_popular_song) {
        this.most_popular_song = most_popular_song;
    }

    public String getMost_popular_member() {
        return most_popular_member;
    }

    public void setMost_popular_member(String most_popular_member) {
        this.most_popular_member = most_popular_member;
    }
    
    
}
