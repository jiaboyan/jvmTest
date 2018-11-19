
import java.sql.SQLException;
import java.util.ServiceLoader;

/**
 * @author jiaboyan
 * @date 2018/4/6
 */
public class JVMTest6 {

   public static void main(String[] agrs) throws ClassNotFoundException {
       ClassLoader loader = JVMTest6.class.getClassLoader();
       //系统默认是应用类加载器
       System.out.println(loader);//sun.misc.Launcher$AppClassLoader@cb6009

       //获得上下文类加载器，默认也是应用类加载器
       ClassLoader loader2 = Thread.currentThread().getContextClassLoader();
       System.out.println(loader2);//sun.misc.Launcher$AppClassLoader@cb6009

       //设置为自定义的文件系统类加载器
       Thread.currentThread().setContextClassLoader(
               new ClassLoaderTest("d:/"));
       System.out.println(Thread.currentThread().getContextClassLoader());

       Class c = Thread.currentThread().getContextClassLoader().loadClass("HelloWorld");
       System.out.println(c.getClassLoader());

       ClassLoader loader3 = String.class.getClassLoader();
       System.out.println(loader3);



//       ServiceLoader<HelloService> loaders = ServiceLoader.load(HelloService.class);
//       for (HelloService helloService : loaders) {
//           helloService.hello();
//       }
   }
}
