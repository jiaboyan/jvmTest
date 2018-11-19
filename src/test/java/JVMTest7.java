import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jiaboyan
 * @date 2018/4/6
 */
public class JVMTest7 {

    @Test
    public void test(){
        try {
            // 注册驱动类
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/testdb";
            //通过java库获取数据库连接
            Connection conn = DriverManager.getConnection(url, "root", "123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   public static void main(String[] agrs) {

   }
}
