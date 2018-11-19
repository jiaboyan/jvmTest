/**
 * @author jiaboyan
 * @date 2018/4/6
 */
public class JVMTest3 {

    private static int staticInteger = 20;

    static {
        System.out.println("父类静态代码块,"+staticInteger);
    }

    int i = 1;

    JVMTest3() {
        System.out.println(i);
        int x = getValue();
        System.out.println(x);
    }

    {
        i = 2;
    }

    protected int getValue() {
        return i;
    }
}
