package pendataansiswa;

import java.sql.*;
import java.io.*;
import javax.swing.*; 

public class Umum {
    public Connection conn;
    public Statement st;
    public ResultSet rs; 
     
    public void konek()    {
        koneksi("localhost","datasiswa","root","");
         
    }   
     
    void koneksi(String server, String db, String user, String pass)     { 
        try { 
            // memanggil kelas driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) { 
            System.out.print("Driver tidak berhasil diload\n");
            e.printStackTrace(); 
            return;
        }
        System.out.print("Driver  berhasil diload\n");
        conn=null;
        try { 
            // menjalankan koneksi
            conn=DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+db,user,pass); 
        }
        catch (SQLException e) {
            System.out.print("Koneksi Tidak Berhasil\n");
            e.printStackTrace();
            return; 
        }
        System.out.print("Koneksi Berhasil"); 
    }
}
