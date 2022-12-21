import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ProgramInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Connection koneksi = KoneksiDatabase.getKoneksi();
    Statement statement = null;
    try {
        statement =koneksi.createStatement();
        System.out.println("Statement berhasil dibuat");
        String url= "INSERT INTO barang (kode_barang,nama_barang,jumlah,harga)VALUES('B001','BUKU GAMBAR',10,3000)";
        statement.ExecuteUpdate(url);
    }catch(SQLException ex){
        System.out.println("Statement gagal dibuat");
        System.out.println("Pesan :"+ex.getMessage());
    }finally{
        if (statement != null){
        try {
        statement.close();
        System.out.println("Statement berhasil ditutup");
        }catch(SQLException ex){
        System.out.println("Statement gagal ditutup");
        System.out.println("Pesan : "+ex.getMessage());
        }
        }
    }
    }
    
}
