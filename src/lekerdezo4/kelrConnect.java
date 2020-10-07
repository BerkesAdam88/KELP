package lekerdezo4;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Berkes
 */
public class kelrConnect {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "kelr";     //adatbázis neve
    private static Integer portnumber = 3306;   //yampp-nál adott port száma
    private static String password = "";

    public static Connection getConnection() {

        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        try {
            cnx = datasource.getConnection();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Az SQL adatbázis nem elérhető!", "Hálózati hiba!", JOptionPane.ERROR_MESSAGE);
        }
        return cnx;
    }

}
