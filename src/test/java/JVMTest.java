import java.util.Calendar;
import java.util.Date;

public class JVMTest {

    public static void main(String... args) {
        Calendar clnow = Calendar.getInstance();
        clnow.add(Calendar.DATE, 1);
        clnow.set(Calendar.HOUR_OF_DAY, 0);
        clnow.set(Calendar.MINUTE, 0);
        Date date = clnow.getTime();


        ChildJVMTest3 child = new ChildJVMTest3();
        System.out.println(child.getValue());
    }
}
