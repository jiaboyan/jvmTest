import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author jiaboyan
 * @date 2018/4/6
 */
public class JVMTest4 {

    static Unsafe unsafe;

    private static class ObjectA {
        String str;  // 4/8
        int i1; // 4
        byte b1; // 1
        byte b2; // 1
        int i2;  // 4
        byte b3;  // 1
    }

    private static class ObjectB {

    }

    public static void main(String[] args){
        ObjectA[] objects = new ObjectA[300000];
        for(int x=0;x<300000;x++){
            objects[x] = new ObjectA();
        }
        System.out.println(ObjectSize.sizeOf(objects));
        System.out.println(ObjectSize.sizeOf(new ObjectA[1]));
        System.out.println(ObjectSize.sizeOf(new ObjectA[2]));

        System.out.println(ObjectSize.sizeOf(new ObjectB[0]));
        System.out.println(ObjectSize.sizeOf(new ObjectB[1]));
        System.out.println(ObjectSize.sizeOf(new ObjectB[2]));
//        Field[] fields = ObjectA.class.getDeclaredFields();
//        for(Field f: fields){
//            System.out.println(f.getName() + " offset: " +unsafe.objectFieldOffset(f));
//
//        }

    }

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
