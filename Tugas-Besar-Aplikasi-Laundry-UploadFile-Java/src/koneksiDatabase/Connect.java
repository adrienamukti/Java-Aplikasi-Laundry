package koneksiDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static Connection MyConnection;
    
    public static Connection configDB() throws SQLException{
        if (MyConnection == null) {
            // Menggunakan driver baru dan URL koneksi dengan parameter timezone
            String url = "jdbc:mysql://localhost:3306/db_uas_laundry?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = ""; // Pastikan password sesuai dengan konfigurasi MySQL Anda
            
            MyConnection = DriverManager.getConnection(url, user, password);
        }
        return MyConnection;
    }
}
