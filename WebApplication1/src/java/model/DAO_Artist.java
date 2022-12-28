/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marce
 */
public class DAO_Artist extends Conexion implements DAO<Artist> {

    public DAO_Artist() throws ClassNotFoundException, SQLException {
        super("artistas");
    }

    @Override
    public void create(Artist ob) throws SQLException {
        ejecutar("INSERT INTO artista VALUES (NULL, '" + ob.getArtist_name() + "'"
                + ", '" + ob.getMost_popular_song() + "', '" + ob.getMost_popular_member() + "');  ");
    }

    @Override
    public List<Artist> read() throws SQLException {
        List<Artist> lista = new ArrayList<Artist>();

        ResultSet rs = ejecutar("SELECT * FROM artista;");

        Artist a;
        while (rs.next()) {
            a = new Artist();

            a.setId(rs.getInt(1));
            a.setArtist_name(rs.getString(2));
            a.setMost_popular_song(rs.getString(3));
            a.setMost_popular_member(rs.getString(4));

            lista.add(a);
        }

        return lista;
    }

    @Override
    public void update(Artist ob) throws SQLException {
        ejecutar("UPDATE artista SET artist_name='" + ob.getArtist_name() + "', most_popular_song='" + ob.getMost_popular_song() + "',"
                + " most_popular_member= '" + ob.getMost_popular_member() + "' WHERE id=" + ob.getId() + "; ");
    }

    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM artista WHERE id=" + id + "; ");
    }

    public Artist filter(String name) throws SQLException {
        ResultSet rs = ejecutar("SELECT * FROM artista WHERE artist_name LIKE '%'" + name + "'%' LIMIT 1;");

        Artist a;
        a = new Artist();
        while (rs.next()) {
            a = new Artist();

            a.setId(rs.getInt(1));
            a.setArtist_name(rs.getString(2));
            a.setMost_popular_song(rs.getString(3));
            a.setMost_popular_member(rs.getString(4));

        }

        return a;
    }

}
