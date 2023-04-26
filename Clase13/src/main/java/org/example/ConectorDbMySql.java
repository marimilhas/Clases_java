package org.example;

import java.sql.*;
import java.util.ArrayList;

public class ConectorDbMySql {

    private void cargarClase() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

    }
    public ArrayList<Departamento> consultarDepartamentos(){
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        try {
            cargarClase();

            Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net/dbprueba2023",
                    "userdb2023", "pass2023");


            stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from departamento");

            while (rs.next()) {
                Departamento depto = new Departamento();
                depto.setNombre(rs.getString("nombre"));
                //depto.setId( rs.getInt("id") );
                depto.setPresupuesto(rs.getInt("presupuesto"));
                departamentos.add(depto);
            }

        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {}
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {}
            }
            return departamentos;
        }
    }

    public void actualizarDepartamentos(){
        Statement stmt = null;
        //ResultSet rs = null;

        try {
            cargarClase();

            Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net/dbprueba2023",
                    "userdb2023", "pass2023");


            stmt = conn.createStatement();
            int filasAfectadas  = stmt.executeUpdate("UPDATE departamento set presupuesto = presupuesto +100");
            System.out.println("Filas afectadas " + filasAfectadas);




        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
        }
        finally {


            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {}
            }

        }
    }
}
