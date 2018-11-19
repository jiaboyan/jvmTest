import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;

public class ClassLoaderTest1 extends URLClassLoader {

    public ClassLoaderTest1(URL[] urls) {
        super(urls);
    }

    public ClassLoaderTest1(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public ClassLoaderTest1(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {
        super(urls, parent, factory);
    }

    public static void main(String[] agrs) {
        String rootDir="D:/";
        File file = new File(rootDir);
        URI uri=file.toURI();
        try {
            URL[] urls= new URL[]{uri.toURL()};
            ClassLoaderTest1 loader = new ClassLoaderTest1(urls);
            Class clazz = loader.loadClass("ObjectTest1");
//            System.out.println(clazz.getClassLoader());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
