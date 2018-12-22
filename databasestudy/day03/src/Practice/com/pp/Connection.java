package Practice.com.pp;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *  Create by
 * */
public class Connection {
    public static void main(String[] args) throws SQLException {
        java.sql.Connection con = JdbcUtil.getConnection();

        String sql = "insert into users values(null,'小白','1246488')";

        Statement st = con.createStatement();
        int i = st.executeUpdate(sql);

        System.out.println(i);

        JdbcUtil.closeAll(con,st,null);
    }


}
