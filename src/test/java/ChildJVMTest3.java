/**
 * @author jiaboyan
 * @date 2018/4/10
 */
public class ChildJVMTest3 extends JVMTest3 {

    private static int staticChildInteger = 10;

    int j = 1;

    ChildJVMTest3() {
        j = 2;
    }

    {
        j = 3;
    }

    static {
        System.out.println("子类静态代码块,"+staticChildInteger);
    }

    @Override
    protected int getValue() {
        return j;
    }


}
