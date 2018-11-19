/**
 * @author jiaboyan
 * @date 2018/3/28
 */
public class JVMString {

//    //采用字面值的方式赋值
//    public static void test1(){
//        String str1 = "jiaboyan";
//        String str2 = "jiaboyan";
//        System.out.println("test1比较结果为："+ (str1 == str2));//true
//        //System.out.println("test1比较结果为："+ str1 == str2);//false 注意此种写法
//    }
//
//    //采用new关键字新建一个字符串对象
//    public static void test2(){
//        String str3 = new String("jiaboyan");
//        String str4 = new String("jiaboyan");
//        System.out.println("test2比较结果为："+ (str3 == str4));//true
//    }

    //编译期确定
    public static void test3(){
        String str1 = "helloworld";
        String str2 = "helloworld";
        String str3 = "hello"+"wor"+"ld";
        System.out.println("test3比较结果为："+ (str1 == str2)); //true
        System.out.println("test3比较结果为："+ (str1 == str3)); //true
    }

//    //编译期无法确定
//    public static void test4(){
//        String str1 = "helloworld";
//        String str2 = new String("helloworld");
//        String str3 = "hello" + new String("world");
//        System.out.println("test4比较结果为："+ ( str1==str2 )); //false
//        System.out.println( "test4比较结果为："+ (str1==str3 )); //false
//        System.out.println( "test4比较结果为："+ (str2==str3 )); //false
//
//    }
//
//    //编译期无法确定
//    public static void test5(){
//        String str1 = "abc";
//        String str2 = "def";
//        String str3 = str1 + str2;
//        System.out.println( "test5比较结果为："+ (str3 == "abcdef")); //false
//
//    }
//
//    //编译期优化
//    public static void test6(){
//        String str1 = "a1";
//        String str2 = "a" + 1;
//        System.out.println("test6比较结果为："+(str1 == str2)); // true
//
//    }
//    //编译期无法确定
//    public static void test7(){
//        String str1 = "ab";
//        String str2 = "b";
//        String str3 = "a" + str2;
//        System.out.println("test7比较结果为："+(str1 == str3)); //false
//    }
//
//    public static void test8(){
//        String test="javalanguagespecification";
//        String str="java";
//        String str1="language";
//        String str2="specification";
//        System.out.println(test == "java" + "language" + "specification");
//        System.out.println(test == str + str1 + str2);
//    }
//
//    public static void test9(){
//        String s0 = "ab";
//        final String s1 = "b";
//        String s2 = "a" + s1;
//        System.out.println("===========test9============");
//        System.out.println((s0 == s2)); //result = true
//    }
//
//    public void test10(){
//        String s0 = "ab";
//        final String s1 = getS1();
//        String s2 = "a" + s1;
//        System.out.println("===========test10============");
//        System.out.println((s0 == s2)); //result = false
//
//    }
//
//    private static String getS1() {
//        return "b";
//    }

    public static void main(String[] agrs){
        test3();
    }
}
