import java.sql.SQLException;

/**
 * @author jiaboyan
 * @date 2018/4/6
 */
public class JVMTest5 {

   public static void main(String[] agrs) throws ClassNotFoundException, SQLException {
//       Class clazz = Class.forName("com.jiaboyan.test.ObjectTest");
//       Class clazzJDBC = Class.forName("java.sql.DriverManager");
//       Class clazz1 = Class.forName("ObjectTest1");
//       Class clazz2 = Class.forName("java.lang.String");
//       System.out.println(clazz.getClassLoader());
       System.out.println(System.getProperty("java.class.path"));


//        String URL="jdbc:mysql://127.0.0.1:3306/ds_0";
//        String USER="root";
//        String PASSWORD="920630";
//        //1.加载驱动程序
//        Class.forName("com.mysql.jdbc.Driver");
//        //2.获得数据库链接
//        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

   }
}
