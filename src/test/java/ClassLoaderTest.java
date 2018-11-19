import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassLoaderTest extends ClassLoader{

    private String loaderRootPath;

    public ClassLoaderTest(ClassLoader parent) {
        super(parent);
    }

    public ClassLoaderTest(String loaderRootPath) {
        this.loaderRootPath = loaderRootPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try{
            String filePath = loaderRootPath + name.replace('.', File.separatorChar) + ".class";
            //指定读取磁盘上的某个文件夹下的.class文件：
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            //此处可以对字节数组进行解密操作：
            //省略。。。。
            //调用defineClass方法，将字节数组转换成Class对象
            Class<?> clazz = this.defineClass(name, bytes, 0, bytes.length);
//            System.out.println(clazz.getClassLoader());
            return clazz;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    public static void main(String[] agrs) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        try {
            ClassLoaderTest classLoaderTest = new ClassLoaderTest("d:/");
            classLoaderTest.loadClass("ObjectTest1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
