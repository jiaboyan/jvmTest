import java.lang.instrument.Instrumentation;

/**
 * @author jiaboyan
 * @date 2018/5/3
 */
public class ObjectSize {

    private static Instrumentation inst;

    public static void premain(String agentArgs, Instrumentation instP){
        inst = instP;
    }

    public static long sizeOf(Object obj){
        return inst.getObjectSize(obj);
    }
}
