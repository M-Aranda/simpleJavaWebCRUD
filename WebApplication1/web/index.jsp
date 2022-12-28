<%@page import="model.DAO_Artist"%>
<%@page import="model.Artist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar artistas</title>


    </head>
    <body>
        <h1>Ingresar artista (CREATE)</h1>
        <form action="registrar.do" method="post">
            <input type="text" name="artist_name" placeholder="Artist name " required >
            <input type="text" name="song_name" placeholder="Most popular song " required >
            <input type="text" name="member_name" placeholder="Most popular member " required >
            <br>
            <br>
            <input type="submit" value="Registrar">

        </form>

        <br>
        <h1>Actualizar artista (UPDATE)</h1>
        <form action="actualizar.do" method="post">
            <input type="text" name="artist_id" placeholder="Id" required >
            <input type="text" name="artist_name" placeholder="Artist name"  >
            <input type="text" name="song_name" placeholder="Most popular song"  >
            <input type="text" name="member_name" placeholder="Most popular member"  >
            <br>
            <br>
            <input type="submit" value="Actualizar">
        </form>
        <br>


        <h1>Borrar artista por id (DELETE)</h1>
        <br>
        <form action="borrar.do" method="post">           
            <input type="text" name="artist_id" placeholder="Id" required >
            <br>
            <br>
            <input type="submit" value="Borrar">
        </form>
        <br>

        <h1>Listado de artistas (READ todo)</h1>

        <%DAO_Artist da = new DAO_Artist();%>

        <table border="2">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Cancion mas popular</th>
                    <th>Miembro mas popular</th>

                </tr>
            </thead>
            <tbody>
                <%

                    for (Artist a : da.read()) {


                %>
                <tr>
                    <td><%= a.getId()%></td>
                    <td><%= a.getArtist_name()%></td>
                    <td><%= a.getMost_popular_song()%></td>
                    <td><%= a.getMost_popular_member()%></td>

                </tr>
                <%}%>
            </tbody>
        </table>
        <br>
        <h1>Buscar artista (Read single)</h1>
        <br>
        <form action="obtener.do" method="post">
            <input type="text" name="artist_name" placeholder="Artist name " required >
            <br>
            <input type="submit" value="Registrar">
        </form>

        <%
            HttpSession ses = request.getSession();
            Artist a = null;
            if (ses.getAttribute("a") != null) {
                a = (Artist) ses.getAttribute("a");%>

        El artista es <%= a.getArtist_name()%>
        <br>
        Su cancion más popular es <%= a.getMost_popular_song()%>
        <br>
        Su miembro mas popular es <%= a.getMost_popular_member()%>
        <%}


        %>

        <br>



        <br>
    </body>
</html>
